package Exam;

import org.jsoup.helper.ValidationException;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AntiCorruptionValid {

    public void percentValidation(int percent) {
        if (percent <= 0) {
            throw new ValidationException("Percent mast be more then 0");
        }
        if (percent >= 100) {
            throw new ValidationException("Вo you have a conscience ?");
        }
    }


    public void accauntValidation(List<Double> accounts) {
        if (Objects.isNull(accounts) || accounts.isEmpty() || accounts.size() == 1) {
            throw new ValidationException("Some problems with users accounts");
        }
    }

}
