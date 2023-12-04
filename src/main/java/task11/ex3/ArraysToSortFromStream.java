package task11.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToSortFromStream {

    public List<Integer> ArraysToSortFromStreamMethod(String[] arr) {
        try {
            String arrToString = String.join(",", arr);
            List<Integer> integerList = Arrays.stream(arrToString.split(","))
                    .map(String::trim).map(Integer::parseInt)
                    .collect(Collectors.toList());
            Collections.sort(integerList);
            return integerList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String[] test = {"9, 12, 3", "5, 11", "8, 1, 7", "4,2", "6", "10"};
        ArraysToSortFromStream arraysToSortFromStream = new ArraysToSortFromStream();
        System.out.println(arraysToSortFromStream.ArraysToSortFromStreamMethod(arr));
        System.out.println(arraysToSortFromStream.ArraysToSortFromStreamMethod(test));
    }
}


//    Є масив:
//
//        ["1, 2, 0", "4, 5"]
//
//        Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
//
//        "0, 1, 2, 4, 5"