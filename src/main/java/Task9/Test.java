package Task9;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(40);
        integerList.add(44);
        integerList.add(23);
        integerList.add(45);
        integerList.add(12);

        integerList.clear();
        System.out.println(integerList);
        System.out.println(integerList.size());

    }
}
