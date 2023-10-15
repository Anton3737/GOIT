package Task8;

public class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape() {
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setName("Коло");
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
