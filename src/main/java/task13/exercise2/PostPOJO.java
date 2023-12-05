package task13.exercise2;

public class PostPOJO {

    public int userId;
    public int id;
    public String title;
    public String body;

    public PostPOJO(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PostPOJO{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}


//Завдання 2
//        Доповніть програму методом, що буде виводити всі коментарі до останнього поста певного користувача і записувати їх у файл.
//        https://jsonplaceholder.typicode.com/users/1/posts Останнім вважаємо пост з найбільшим id.
//        https://jsonplaceholder.typicode.com/posts/10/comments //
//        Файл повинен називатись user-X-post-Y-comments.json, де Х - id користувача, Y - номер посту.