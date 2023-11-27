package task13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    private int userId;
    private int id;
    private String title;
    private String completed;

    public Task3(int userId, int id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "UserId: " + userId + " ID: " + id + " Title: " + title + " Completed: " + completed;
    }

    public static List<Task3> todosParser(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        try (JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()))) {
            Task3[] task3s = gson.fromJson(jsonReader, Task3[].class);

            return Arrays.stream(task3s)
                    .filter(todo -> "false".equals(todo.getCompleted()))
                    .collect(Collectors.toList());
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            List<Task3> incompleteTodos = todosParser("https://jsonplaceholder.typicode.com/users/1/todos");
            incompleteTodos.forEach(System.err::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//Завдання 3
//        Доповніть програму методом, що буде виводити всі відкриті задачі для користувача з ідентифікатором X.
//        https://jsonplaceholder.typicode.com/users/1/todos.
//        Відкритими вважаються всі задачі, у яких completed = false.