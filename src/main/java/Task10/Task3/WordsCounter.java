package Task10.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCounter {
    public void wordsCounterMethod(String url) throws FileNotFoundException {
        // Колекція Map що приймає в себе унікальні слова нижнього решісту з тексту та
        // Map - об'єкт, який зберігає пари ключ-значення і не може містити ключів,
        // що повторюються. При додаванні елемента за існуючим ключем
        // відбувається запис нового елемента по ключу замість старого.
        Map<String, Integer> wordsCounterStatic = new HashMap<>();
        FileReader fileReader = new FileReader(url.toLowerCase());
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            // створюємо об'єкт стрінг білдер який побудує нам текстове представлення до майбутньої змінної.
            StringBuilder stringBuilder = new StringBuilder();
            // створюємо тимчасову стрінгову змінну і задаємо їй значення null
            String temp1 = null;
            // працюючи через ітератор перевіряємо чи не дорівнює null наступне його значення рядку.
            while ((temp1 = bufferedReader.readLine()) != null) {
                stringBuilder.append(temp1);
            }
            // створюємо змінну типу даних стрінг та передаємо значення нашого стрингбилдера
            String contentFromWordsFile = stringBuilder.toString();
            Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
            Matcher matcher = pattern.matcher(contentFromWordsFile);
            while (matcher.find()) {
                String match = matcher.group(); // Отримати частину рядка, яка відповідає шаблону

                wordsCounterStatic.put(match, wordsCounterStatic.getOrDefault(match, 0) + 1);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.err.println(wordsCounterStatic);
    }

    public static void main(String[] args) throws FileNotFoundException {
        WordsCounter wordsCounter = new WordsCounter();
        wordsCounter.wordsCounterMethod("src/main/java/Task10/Task3/words.txt");
    }
}
