package h.burgenland.simulator.api;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StationServiceTest {

    @Test
    void isUnavailableBeforePreload() {
        StationService service = new StationService(new FakeStationDataSource());
        ResponseStatusException exception =
                assertThrows(ResponseStatusException.class, () -> service.sensorInput("Bienenstand_1"));
        assertEquals(HttpStatus.SERVICE_UNAVAILABLE, exception.getStatusCode());
    }

    @Test
    void servesLoadedStationsAfterPreload() {
        StationService service = new StationService(new FakeStationDataSource());
        service.preloadAll();
        assertEquals(List.of(new StationDto("Bienenstand_1", true), new StationDto("Bienenstand_2", true)),
                service.stations());
        assertEquals(FakeStationDataSource.BEST_INPUT, service.sensorInput("Bienenstand_1"));
    }

    @Test
    void unknownStationIsNotFound() {
        StationService service = new StationService(new FakeStationDataSource());
        service.preloadAll();
        ResponseStatusException exception =
                assertThrows(ResponseStatusException.class, () -> service.sensorInput("Bienenstand_9"));
        assertEquals(HttpStatus.NOT_FOUND, exception.getStatusCode());
    }

    @Test
    void failedStationStaysNotReady() {
        StationService service = new StationService(new FakeStationDataSource("Bienenstand_2"));
        service.preloadAll();
        assertEquals(List.of(new StationDto("Bienenstand_1", true), new StationDto("Bienenstand_2", false)),
                service.stations());
        ResponseStatusException exception =
                assertThrows(ResponseStatusException.class, () -> service.sensorInput("Bienenstand_2"));
        assertEquals(HttpStatus.SERVICE_UNAVAILABLE, exception.getStatusCode());
    }
}
