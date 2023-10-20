package Task8;

public class Main {

    public static void main(String[] args) {

        // Створюю екземпляри класів фігур що ініціалізую через  методи set з описового класу Shape
        // так як класи з фігур успадковуються відбатьківського класу Shape то ми можемо викликати конструктори ,,атьківського класу.
        Circle circle = new Circle();
        circle.setName("Коло");
        // присвоївши ім'я для класу ми викликаємо його звертаючись до посилання класу і виведимо результат його імені так як ми перевизначили метод toString
        System.out.println(circle);

        Triangular triangular = new Triangular();
        triangular.setName("Трикутник");
        System.out.println(triangular);

        Star star = new Star();
        star.setName("Зірка");
        System.out.println(star);

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setName("Паралелограм");
        System.out.println(parallelogram);

        Square square = new Square();
        square.setName("Квадрат");
        System.out.println(square);

        Trapeze trapeze = new Trapeze();
        trapeze.setName("Трапеція");
        System.out.println(trapeze);
    }
}
