package Task10.Tast2;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

//
//    String text = "Віктор 22";
//    String[] parts = text.split("\\s+\\d+\\s*");
//    String name = parts[0];
//    String age = parts[1];
//
//System.out.println("Ім'я: " + name);
//        System.out.println("Вік: " + age);