package GoITCore.task11.ex4;

import java.util.stream.Stream;

import static java.lang.System.currentTimeMillis;

public class RandomStreamer {

    private final long a = 25214903917L;
    private final int c = 11;
    private final int m = 2 ^ 48;

//    private long seed = 25214903917L;

    //Використовуємо мілісекунди що змінюються і таким чином змінюємо вихідне число seed
    private long seed = currentTimeMillis();


    public Stream<Long> Randomizer(long a, int c, int m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        RandomStreamer randomStreamer = new RandomStreamer();
        // для 100 елементів
        //randomStreamer.Randomizer(randomStreamer.a, randomStreamer.c, randomStreamer.m).limit(100).forEach(System.out::println);

        // нескінченний потік рандомних чисел
        randomStreamer.Randomizer(randomStreamer.a, randomStreamer.c, randomStreamer.m).forEach(System.out::println);
    }
}

//    Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
//        Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed, і далі кожний наступний елемент
//        рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.
//        Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
//        Для тесту використовуйте такі дані:
//        a = 25214903917
//        c = 11
//        m = 2^48 (2в степені48`)