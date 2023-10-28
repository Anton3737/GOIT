package Task10.Tast2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {

    public void readerTextFileMethod(String url) throws FileNotFoundException {
        ArrayList<String> usersFromFileArray = new ArrayList<>();
        FileReader fileReader = new FileReader(url);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String temp1 = null;
            while ((temp1 = bufferedReader.readLine()) != null) {
                Pattern pattern = Pattern.compile(" ");
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


//    public void usersToJSONFileConvertor() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        User users = new User("Христина", 25);
//        objectMapper.writeValue(new File("src/main/java/Task10/Tast2/Users.json"), users);
//
//    }


    public static void main(String[] args) throws IOException {
        UserParser userParser = new UserParser();
//        userParser.usersToJSONFileConvertor();
        userParser.readerTextFileMethod("src/main/java/Task10/Tast2/file.txt");
    }
}
