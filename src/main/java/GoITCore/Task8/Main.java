package GoITCore.Task8;

public class Main {

    public static void main(String[] args) {

        // Створюю екземпляри класів фігур що ініціалізую іменем через методи set для поля name з описового класу Shape
        // так як класи з фігур успадковуються від батьківського класу Shape то ми можемо викликати конструктори дочірнього класу.
        // присвоївши ім'я для класу ми викликаємо його звертаючись до посилання класу і виведимо результат його імені так як ми перевизначили метод toString

        Shape circle = new Circle();
        circle.setName("Коло" + " ◉");
        System.out.println(circle);

        Shape triangular = new Triangular();
        triangular.setName("Трикутник" + " ▼");
        System.out.println(triangular);

        Shape star = new Star();
        star.setName("Зірка" + " ★");
        System.out.println(star);

        Shape parallelogram = new Parallelogram();
        parallelogram.setName("Паралелограм" + " ▱");
        System.out.println(parallelogram);

        Shape square = new Square();
        square.setName("Квадрат" + " ▩");
        System.out.println(square);

        Shape trapeze = new Trapeze();
        trapeze.setName("Трапеція" + " ⏢");
        System.out.println(trapeze);

        System.out.println("\n _______________________________\n");

        // Створено окремий екземпляр класу від класу ShapePrinter де реалізовано 1 метод принтер що приймає екземпляр класу фігури та
        // повертає поле name що передано в методі set.


        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShape(circle);
        shapePrinter.printShape(triangular);
        shapePrinter.printShape(star);
        shapePrinter.printShape(square);
        shapePrinter.printShape(trapeze);
    }
}

//    Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");