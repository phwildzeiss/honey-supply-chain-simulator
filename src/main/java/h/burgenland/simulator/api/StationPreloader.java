package h.burgenland.simulator.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "simulator.preload-stations", havingValue = "true", matchIfMissing = true)
public class StationPreloader {

    private final StationService stationService;

    public StationPreloader(StationService stationService) {
        this.stationService = stationService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void preloadInBackground() {
        Thread thread = new Thread(stationService::preloadAll, "station-preloader");
        thread.setDaemon(true);
        thread.start();
    }
}
