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

class MciControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new MciController()).build();
    }

    private ResultActions postOrigin(String body) throws Exception {
        return mockMvc.perform(post("/api/mci/origin").contentType(MediaType.APPLICATION_JSON).content(body));
    }

    @Test
    void bestCaseGivesMaximumValues() throws Exception {
        postOrigin("{\"variety\":\"PREMIUM_VARIETAL\",\"region\":\"REGIONAL_GPS_VERIFIED\"}")
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.variety").value(10000))
                .andExpect(jsonPath("$.region").value(10000));
    }

    @Test
    void lowerCategoriesMapToIntermediateValues() throws Exception {
        postOrigin("{\"variety\":\"MIXED_BLOSSOM\",\"region\":\"EU_MIX\"}")
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.variety").value(0))
                .andExpect(jsonPath("$.region").value(2500));
    }

    @Test
    void unknownEnumValueIsBadRequest() throws Exception {
        postOrigin("{\"variety\":\"GOLDEN\",\"region\":\"EU_MIX\"}")
                .andExpect(status().isBadRequest());
    }

    @Test
    void missingRegionIsBadRequest() throws Exception {
        postOrigin("{\"variety\":\"PREMIUM_VARIETAL\"}")
                .andExpect(status().isBadRequest());
    }
}
