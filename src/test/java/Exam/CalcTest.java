package Exam;

import org.jsoup.helper.ValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void divideMethodTest() throws Exception {
        Calc calc = new Calc();
        double actualResult = calc.divideMethod(10, 5);
        double expectedResult = 2.0;

        assertEquals(expectedResult, actualResult, String.format("Some erore. Actual = %s  Expected = %s", actualResult, expectedResult));
    }

    @Test
    void divideMethodZero() {
        Calc calc = new Calc();
        assertThrows(ValidationException.class, () -> calc.divideMethod(10, 0));

    }
}