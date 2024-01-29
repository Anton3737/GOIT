package GoITCore.Task10.Tast2;

public class User {
    // створюємо звичайни описовий клас з приватними полями , конструктором і методами get та set
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
