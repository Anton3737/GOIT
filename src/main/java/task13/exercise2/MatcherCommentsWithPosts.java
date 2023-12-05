package task13.exercise2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
//import java.awt.List;

public class MatcherCommentsWithPosts {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void MatcherCommentsWithPostsMethod(int userId) {


        try {
            List<String> postsParserListRes = ParserPost.postsParser(userId);
            String post = postsParserListRes.toString();

            List<String> comentsParsList = ParserComents.commentsParser(userId);

            System.out.println("------------------POST-----------------");
            for (String posts : postsParserListRes) {
                System.out.println(ANSI_PURPLE + posts + ANSI_RESET + "\n");
            }

            System.out.println("-----------------COMMENT---------------");

            for (String coments : comentsParsList) {
                System.out.println(ANSI_GREEN + coments + ANSI_RESET + "\n");
            }

            ResultPostWithComentsPOJO combinedData = new ResultPostWithComentsPOJO(post, comentsParsList);

            Gson gson = new Gson();
            String json = gson.toJson(combinedData);

            String nameFile = String.format("user-%d-post-%d-comments.json", userId, userId);

            FileWriter fileWriter = new FileWriter("src/main/java/task13/exercise2/source/" + nameFile, StandardCharsets.UTF_8);
            fileWriter.write(json);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MatcherCommentsWithPosts matcherCommentsWithPosts = new MatcherCommentsWithPosts();
        matcherCommentsWithPosts.MatcherCommentsWithPostsMethod(2);
    }
}


//Завдання 2
//        Доповніть програму методом, що буде виводити всі коментарі до останнього поста певного користувача і записувати їх у файл.
//        https://jsonplaceholder.typicode.com/users/1/posts Останнім вважаємо пост з найбільшим id.
//        https://jsonplaceholder.typicode.com/posts/10/comments
//        Файл повинен називатись user-X-post-Y-comments.json, де Х - id користувача, Y - номер посту.