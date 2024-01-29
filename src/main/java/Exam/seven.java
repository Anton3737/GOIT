package Exam;

import java.util.Arrays;

public class seven {

    public static void main(String[] args) {

        String iceland = "Iceland";
        String ireland = "Ireland";

        int latter = 99;

        for (int i = latter; i <= 114; i++) {
            if ((iceland.replace(iceland.charAt(1), (char) i).equals(iceland))) {
                System.out.println("\u001B[36m" + "Iceland" + "\u001B[0m");
                continue;
            }
            if ((iceland.replace(iceland.charAt(1), (char) i)).equals(ireland)) {
                System.out.println("\u001B[32m" + "Ireland" + "\u001B[0m");
                break;
            }
            System.out.println(iceland.replace(iceland.charAt(1), (char) i));
        }
    }
}
