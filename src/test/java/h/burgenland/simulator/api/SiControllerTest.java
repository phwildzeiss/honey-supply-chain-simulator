package h.burgenland.simulator.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class SiControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        StationService service = new StationService(new FakeStationDataSource());
        service.preloadAll();
        mockMvc = MockMvcBuilders.standaloneSetup(new SiController(service)).build();
    }

    private ResultActions postSi(String body) throws Exception {
        return mockMvc.perform(post("/api/si").contentType(MediaType.APPLICATION_JSON).content(body));
    }

    @Test
    void returnsAllCriteriaInContractScale() throws Exception {
        postSi("{\"sensorStation\":\"Bienenstand_1\",\"waterSourceDistanceMeters\":150}")
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.forage").value(10000))
                .andExpect(jsonPath("$.waterSource").value(10000))
                .andExpect(jsonPath("$.precipitation").value(10000));
    }

    @Test
    void enteredWaterDistanceOverridesStoredOne() throws Exception {
        postSi("{\"sensorStation\":\"Bienenstand_1\",\"waterSourceDistanceMeters\":800}")
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.waterSource").value(0))
                .andExpect(jsonPath("$.forage").value(10000));
    }

    @Test
    void unknownStationIsNotFound() throws Exception {
        postSi("{\"sensorStation\":\"Bienenstand_9\",\"waterSourceDistanceMeters\":150}")
                .andExpect(status().isNotFound());
    }

    @Test
    void negativeDistanceIsBadRequest() throws Exception {
        postSi("{\"sensorStation\":\"Bienenstand_1\",\"waterSourceDistanceMeters\":-1}")
                .andExpect(status().isBadRequest());
    }

    @Test
    void missingDistanceIsBadRequest() throws Exception {
        postSi("{\"sensorStation\":\"Bienenstand_1\"}")
                .andExpect(status().isBadRequest());
    }
}
