package h.burgenland.simulator.api;

import h.burgenland.simulator.si.model.SensorInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StationService {

    private static final Logger log = LoggerFactory.getLogger(StationService.class);

    private final StationDataSource dataSource;
    private final Map<String, SensorInput> cache = new ConcurrentHashMap<>();
    private volatile List<String> stationNames = List.of();

    public StationService(StationDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void preloadAll() {
        try {
            stationNames = dataSource.stationNames();
        } catch (Exception e) {
            log.error("Failed to load station names", e);
            return;
        }
        for (String station : stationNames) {
            try {
                cache.put(station, dataSource.load(station));
                log.info("Loaded sensor data for {}", station);
            } catch (Exception e) {
                log.error("Failed to load sensor data for {}", station, e);
            }
        }
    }

    public List<StationDto> stations() {
        return stationNames.stream()
                .map(name -> new StationDto(name, cache.containsKey(name)))
                .toList();
    }

    public SensorInput sensorInput(String station) {
        if (stationNames.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Stations are still loading");
        }
        if (!stationNames.contains(station)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unknown station: " + station);
        }
        SensorInput input = cache.get(station);
        if (input == null) {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Sensor data for " + station + " is not loaded yet");
        }
        return input;
    }
}
