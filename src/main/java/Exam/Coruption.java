package Exam;

import java.util.List;

public class Coruption {

    public Double billsCounter(int percent, List<Double> accounts) {
        AntiCorruptionValid valid = new AntiCorruptionValid();
        valid.percentValidation(percent);
        valid.accauntValidation(accounts);
        return 0.0;
    }



}
