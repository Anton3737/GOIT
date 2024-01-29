package Exam;

import org.jsoup.helper.ValidationException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class CoruptionTest {

    private Coruption coruption;

    @BeforeAll
    static void init() {

    }

    @BeforeEach
    void start() {
        coruption = new Coruption();
    }


    @Test
    void billsCounter() throws Exception {
        Double expectedres = 1995.0;
        Double actual =  coruption.billsCounter(5, asList(1000.0, 1100.0));
    }
}