package task11.ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ExerciseOne {
    public List<String> oddIndexWithoutStream(String url) throws FileNotFoundException {
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


    public List<String> oddIndexWithStream(String url) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url))) {
            List<String> oddNamesList = bufferedReader.lines().collect(Collectors.toList());
            return IntStream.range(0, oddNamesList.size()).filter(i -> i % 2 == 1).mapToObj(oddNamesList::get).peek(System.out::println).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        ExerciseOne ExerciseOne = new ExerciseOne();
        ExerciseOne.oddIndexWithoutStream("src/main/java/task11/ex1/names.txt");

        ExerciseOne.oddIndexWithStream("src/main/java/task11/ex1/names.txt");
    }
}

//
//Завдання 1
//        Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter...
//        лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)