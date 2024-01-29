package Exam;

public class test1 {
    public static void main(String[] args) {

        int i = 10;
        do {
            for (int j = i / 2; j > 0; j--) {
                System.out.println(j + " ");
            }

            i -= 2;
        } while (i > 0);
    }
}
