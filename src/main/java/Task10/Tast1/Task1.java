package Task10.Tast1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task1 {

    public void phoneNumberValidatorMethod(String url) throws FileNotFoundException {

        FileReader fileReader = new FileReader(url);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String temp1 = null;
            while ((temp1 = bufferedReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");
                Matcher matcher = pattern.matcher(temp1);
                while (matcher.find()) {
                    String match = matcher.group(); // Отримати частину рядка, яка відповідає шаблону
                    System.out.println(match);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {
        Task1 task1 = new Task1();
        task1.phoneNumberValidatorMethod("src/main/java/Task10/Tast1/file.txt");
    }
}
