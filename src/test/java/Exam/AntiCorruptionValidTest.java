package Exam;

import org.jsoup.helper.ValidationException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class AntiCorruptionValidTest {

    @Test
    void percentValidationPersentIsZero() {
        AntiCorruptionValid antiCorruptionValid = new AntiCorruptionValid();
        assertThrows(ValidationException.class, () -> antiCorruptionValid.percentValidation(0));
    }

    @Test
    void percentValidationMoreThen100() {
        AntiCorruptionValid antiCorruptionValid = new AntiCorruptionValid();
        assertThrows(ValidationException.class, () -> antiCorruptionValid.percentValidation(0));
    }


    @Test
    void accauntValidationAccauntsListIsNull() {
        AntiCorruptionValid antiCorruptionValid = new AntiCorruptionValid();
        assertThrows(ValidationException.class, () -> antiCorruptionValid.accauntValidation(null));
    }

    @Test
    void accauntValidationAccauntsIsEmpty() {
        AntiCorruptionValid antiCorruptionValid = new AntiCorruptionValid();
        assertThrows(ValidationException.class, () -> antiCorruptionValid.accauntValidation(new ArrayList<>()));
    }
}

