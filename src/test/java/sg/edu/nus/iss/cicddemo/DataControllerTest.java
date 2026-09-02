package sg.edu.nus.iss.cicddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sg.edu.nus.iss.cicddemo.Controller.DataController;

@SpringBootTest
class DataControllerTest {

    @Autowired
    private DataController dataController;

    @Test
    void health() {
        assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    void version() {
        assertEquals("The actual version is 1.0.0", dataController.version());
    }

    @Test
    void nationsLength() {
        assertEquals(10, dataController.getRandomNations().size());
    }

    @Test
    void currenciesLength() {
        assertEquals(20, dataController.getRandomCurrencies().size());
    }
}
