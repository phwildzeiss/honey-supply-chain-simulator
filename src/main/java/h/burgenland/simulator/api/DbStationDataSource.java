package h.burgenland.simulator.api;

import h.burgenland.simulator.si.SiEvaluationService;
import h.burgenland.simulator.si.model.Apiary;
import h.burgenland.simulator.si.model.SensorInput;
import h.burgenland.simulator.si.repository.ApiaryRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class DbStationDataSource implements StationDataSource {

    private final ApiaryRepository apiaryRepository = new ApiaryRepository();
    private final SiEvaluationService siEvaluationService = new SiEvaluationService();
    private final int year;

    public DbStationDataSource(@Value("${simulator.sensor-data-year:2024}") int year) {
        this.year = year;
    }

    @Override
    public List<String> stationNames() throws SQLException {
        return apiaryRepository.findAll().stream().map(Apiary::name).toList();
    }

    @Override
    public SensorInput load(String station) throws SQLException {
        Apiary apiary = apiaryRepository.findAll().stream()
                .filter(candidate -> candidate.name().equals(station))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown station: " + station));
        return siEvaluationService.aggregate(apiary, year);
    }
}
