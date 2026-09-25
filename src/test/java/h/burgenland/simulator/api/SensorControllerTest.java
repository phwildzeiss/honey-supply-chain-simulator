package h.burgenland.simulator.api;

import h.burgenland.simulator.sensors.SensorReadingGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Random;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class SensorControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        SensorReadingGenerator generator = new SensorReadingGenerator(40, 60, 0.0, new Random(1));
        mockMvc = MockMvcBuilders.standaloneSetup(new SensorController(generator, generator, generator)).build();
    }

    @Test
    void transportForcedViolationExceedsThresholds() throws Exception {
        mockMvc.perform(post("/api/sensors/transport").param("force", "VIOLATION"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.violation").value(true));
    }

    @Test
    void warehouseWithoutForceIsNotViolatedGivenZeroProbability() throws Exception {
        mockMvc.perform(post("/api/sensors/warehouse"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.violation").value(false));
    }

    @Test
    void invalidForceValueIsBadRequest() throws Exception {
        mockMvc.perform(post("/api/sensors/defrost").param("force", "MAYBE"))
                .andExpect(status().isBadRequest());
    }
}
