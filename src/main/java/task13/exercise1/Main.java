package task13.exercise1;

import Task10.Tast2.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.sun.source.tree.IfTree;

import java.io.*;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static task13.exercise1.HttpHendler.*;

public class Main {

    private static final String USERS_URL = "https://jsonplaceholder.typicode.com/users";


    public static void main(String[] args) throws IOException {
        HttpHendler httpHendler = new HttpHendler();

        System.out.println("--------------------------------------GET-----------------------------------------");
        httpHendler.sendGET(USERS_URL);

        System.out.println("-------------------------------------CREATE---------------------------------------");
        String addPesron = httpHendler.createUSER("Taras", "Shevchenko", "Kobzar@ukr.net");
        System.out.println("Created User: " + addPesron);

        System.out.println("-------------------------------------UPDATE---------------------------------------");
        String updatePerson = httpHendler.updateUSER(1, "Grygorii", "Skovoroda", "Skovoroda@gmail.com");
        System.out.println("Update User: " + updatePerson);

        System.out.println("-------------------------------------DELETE---------------------------------------");
        int deleteObject = 5;
        boolean isDelete = deleteUSER(deleteObject);
        System.out.println("Delete User: " + isDelete);

    }
}
