package Exam;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 8, 1, 9, 5, 7, 6, 4);
        int sum = numbers.stream().reduce(0, (n, m) -> n + m);

    }

}

