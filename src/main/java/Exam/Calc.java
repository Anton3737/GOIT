package Exam;

import org.jsoup.helper.ValidationException;

public class Calc {

    public double divideMethod(int first, int second) throws Exception{

        if (second == 0) {
            throw new ValidationException("I can't divide to )!");
        }
        return (double) first / second;
    }
}
