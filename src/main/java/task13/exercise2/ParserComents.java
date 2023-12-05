package task13.exercise2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ParserComents {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static List<String> commentsParser(int idPost) throws IOException {

        String urlTemplate = "https://jsonplaceholder.typicode.com/posts/%d/comments";

        String finalUrl = String.format(urlTemplate, idPost);

        List<String> postPOJOList = new ArrayList<>();

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = new Gson();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(finalUrl).openStream()));

        ComentsPOJO[] postPOJOArrays = gson.fromJson(jsonReader, ComentsPOJO[].class);

        for (ComentsPOJO commentsToPost : postPOJOArrays) {
//            System.out.println(ANSI_GREEN + " Пост ID = " + commentsToPost.postId + "\n" + " ID " + commentsToPost.id + "\n" + " NAME " + commentsToPost.name + "\n" + " EMAIL " + commentsToPost.email + "\n" + " BODY " + commentsToPost.body + ANSI_RESET);
//            System.out.println(ANSI_GREEN + " Пост ID = " + commentsToPost.postId + "\n" + " BODY " + commentsToPost.body + ANSI_RESET);
            postPOJOList.add(commentsToPost.body);
        }

//        System.out.println("Кількість коментарів до посту " + postPOJOList.size());

        return postPOJOList;
    }


//    public static void main(String[] args) throws IOException {
//        commentsParser(1);
//    }
}
