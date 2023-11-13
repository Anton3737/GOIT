package task11.ex2;

import task11.ex1.ExerciseOne;

import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;

public class NamesOnUpperCaseAndSorted {

    public List<String> upperAndSorted(String url) throws FileNotFoundException {
        List<String> upperNames = new ArrayList<>();

        FileReader fileReader = new FileReader(url);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String temp1 = null;
            while ((temp1 = bufferedReader.readLine()) != null) {
                upperNames.add(temp1.toUpperCase());
            }
            Collator ukrainianComparator = Collator.getInstance(new Locale("uk", "UA"));
            Collections.sort(upperNames, ukrainianComparator.reversed());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < upperNames.size(); i++) {
            System.out.println(i + " " + upperNames.get(i));
        }
        return upperNames;
    }


    public static void main(String[] args) throws FileNotFoundException {
        NamesOnUpperCaseAndSorted namesOnUpperCaseAndSorted = new NamesOnUpperCaseAndSorted();
        namesOnUpperCaseAndSorted.upperAndSorted("src/main/java/task11/ex1/names.txt");
    }
}

