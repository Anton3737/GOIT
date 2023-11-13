package task11.ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExerciseOne {
    private List<String> oddIndex(String url) throws FileNotFoundException {
        List<String> oddNamesList = new ArrayList<>();

        FileReader fileReader = new FileReader(url);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String temp1 = null;
            while ((temp1 = bufferedReader.readLine()) != null) {
                oddNamesList.add(temp1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Розмір колекції ДО вирахування парних чисел " + oddNamesList.size() + "\n");

        for (int i = 0; i < oddNamesList.size(); i++) {
            if (i % 2 == 1) {
                System.out.println(i + " " + oddNamesList.get(i));
            }
        }

        return oddNamesList;
    }


    public static void main(String[] args) throws FileNotFoundException {
        ExerciseOne ExerciseOne = new ExerciseOne();
        ExerciseOne.oddIndex("src/main/java/task11/ex1/names.txt");
    }
}
