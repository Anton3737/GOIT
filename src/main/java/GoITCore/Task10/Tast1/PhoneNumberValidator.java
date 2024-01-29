package GoITCore.Task10.Tast1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    // створюємо метод phoneNumberValidatorMethod(String url)
    public void phoneNumberValidatorMethod(String url) throws FileNotFoundException {

        // створюємо об'єкт від класу FileReader який працює з потоками символів і передаємо йому посилання
        FileReader fileReader = new FileReader(url);

        // через конструкцію try catch з ресурсами передаємо в параметри конструкції створення об'єкту
        // від класу bufferedReader в який передаємо екземпляр класу fileReader який зчитує потік.
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            // створюємо тимчасову стрінгову змінну і задаємо їй значення null
            String temp1 = null;
            // працюючи через ітератор перевіряємо чи не дорівнює null наступне його значення рядку.
            while ((temp1 = bufferedReader.readLine()) != null) {
                // так як нам необхідно виконати перевірку на валідність ми використовуємо Pattern Matcher
                // даний регулярний вираз "\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}"
                // дозволяє нам пройтись по валідним номерам телефонів
                Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");
                Matcher matcher = pattern.matcher(temp1);
                while (matcher.find()) {
                    // одночасно ми створюємо вкладений цикл в циклі
                    String match = matcher.group(); // Отримати частину рядка, яка відповідає шаблону
                    System.out.println(match); // виводимо в консоль результат
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Точка запуску програми
    public static void main(String[] args) throws IOException {
        // створюємо екземпляр класу
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        // викликаємо метод .phoneNumberValidatorMethod() де в параметр передаємо посилання
        // на вихідний файл для зчитування до екземпляру класу phoneNumberValidator
        phoneNumberValidator.phoneNumberValidatorMethod("src/main/java/Task10/Tast1/file.txt");
    }
}
// Валідні номери 2х видів (xxx) xxx-xxxx та xxx-xxx-xxxx ,а також не валідний ххх ххх хххх
// записані в файлі за посиланням src/main/java/Task10/Tast1/file.txt