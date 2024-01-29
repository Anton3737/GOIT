package GoITCore.Task10.Tast2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UserParser {

    public void readerTextFileMethod(String url) throws FileNotFoundException {
        List<User> usersFromFileArray = new ArrayList<>();   // Список-Колекція що розширюється та вміщає в собі об'єкти у вигляді масивів з 2_ма параметрами (name , age)

        // створюємо об'єкт від класу FileReader який працює з потоками символів і передаємо йому посилання
        FileReader fileReader = new FileReader(url);

        // через конструкцію try catch з ресурсами передаємо в параметри конструкції створення об'єкту
        // від класу bufferedReader в який передаємо екземпляр класу fileReader який зчитує потік.
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            // створюємо тимчасову стрінгову змінну і задаємо їй значення null
            String temp1 = null;
            // працюючи через ітератор перевіряємо чи не дорівнює null наступне його значення рядку.
            while ((temp1 = bufferedReader.readLine()) != null) {
                // Створюємо стрінговий масив в який передаємо тимчасову змінну типу стрінг але яка нічого не вміщує і ділимо текст (тобто пустоту)
                String[] usersDataFromFile = temp1.split(" ");

                if (usersDataFromFile.length == 2) {
                    // беремо кожен елемент масиву з 2х значень name та age та передаємо їх в новий масив user та додаємо об'єкт в список usersFromFileArray
                    //Створюємо 2 змінні і за індексами 0 та 1 ми передаємо в змінні значення з нашого масиву із ємністю 2 од параметри (name та age)
                    String name = usersDataFromFile[0];
                    String age = usersDataFromFile[1];
                    // Ці змінні передаємо до об'єкту user що в свою чергу додається до колекції.
                    User user = new User(name, age);
                    usersFromFileArray.add(user);
                    // отримуємо колекцію об'єктів
                    // ObjectMapper клас що ми підтягуємо з бібліотеки jackson додавши залежність в pom.xml
                    ObjectMapper objectMapper = new ObjectMapper();
                    // вказуємо маршрут куди записуємо новий файл json та яку колекцію ми будемо конвертувати.
                    objectMapper.writeValue(new File("src/main/java/Task10/Tast2/users.json"), usersFromFileArray);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Перевірка виводу в консоль зчитаний файл типу даних User
//        for (User user : usersFromFileArray) {
//            System.out.println("name: " + user.getName());
//            System.out.println("age: " + user.getAge());
//        }
    }

//    необхідно створити наступний файл user.json:
//            [
//    {
//        "name": "alice",
//            "age":21
//    },
//    {
//        "name": "ryan",
//            "age":30
//    }
//]

    public static void main(String[] args) throws IOException {
        UserParser userParser = new UserParser();
        userParser.readerTextFileMethod("src/main/java/Task10/Tast2/file.txt");
    }
}
