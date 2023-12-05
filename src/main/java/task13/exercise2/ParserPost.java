package task13.exercise2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ParserPost {

    public static final String ANSI_PURPLE = "\u001B[35m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static List<String> postsParser(int idUsers) throws IOException {

        String urlTemplate = "https://jsonplaceholder.typicode.com/users/%d/posts";

        String finalUrl = String.format(urlTemplate, idUsers);

        List<String> postPOJOList = new ArrayList<>();

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = new Gson();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(finalUrl).openStream()));

        PostPOJO[] postPOJOArrays = gson.fromJson(jsonReader, PostPOJO[].class);

        postPOJOList.clear();

        if (postPOJOArrays.length > 0) {
            PostPOJO lastPost = postPOJOArrays[postPOJOArrays.length - 1];
//            System.out.println(ANSI_PURPLE + lastPost.userId + "\n" + lastPost.id + "\n" + lastPost.title + "\n" + lastPost.body + ANSI_RESET);
            postPOJOList.add(lastPost.body);
        }

//        System.out.println(postPOJOList.size());

        return postPOJOList;
    }


//    public static void main(String[] args) throws IOException {
//        postsParser(1);
//    }
}

