package GoITCore.task12;

class FizzBuzz extends Thread {
    private static final Object lock = new Object();
    private static int currentNumber = 1;
    private static final int n = 15;

    private final String value;
    private final int divNumber;

    FizzBuzz(String valueToPrint, int divisor) {
        this.value = valueToPrint;
        this.divNumber = divisor;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (currentNumber > n) {
                    break;
                }
                if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else if (currentNumber % 3 == 0) {
                    System.out.println("fizz");
                } else if (currentNumber % 5 == 0) {
                    System.out.println("buzz");
                } else if (currentNumber % n == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println(currentNumber);
                }
                currentNumber++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz A = new FizzBuzz("fizz", 3);
        FizzBuzz B = new FizzBuzz("buzz", 5);
        FizzBuzz C = new FizzBuzz("fizz", 3);
        FizzBuzz D = new FizzBuzz("buzz", 5);

        A.start();
        B.start();
        C.start();
        D.start();
    }
}


//Завдання 2
//        Напишіть програму, що виводить в консоль рядок, що складається з чисел від 1 до n, але з заміною деяких значень:
//        якщо число ділиться на 3 - вивести fizz
//        якщо число ділиться на 5 - вивести buzz
//        якщо число ділиться на 3 і на 5 одночасно - вивести fizzbuzz
//        Наприклад, для n = 15, очікується такий результат: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz.
//        Програма повинна бути багатопотоковою, і працювати з 4 потоками:
//        Потік A викликає fizz(), щоб перевірити, чи ділиться число на 3, і якщо так - додати в чергу на виведення для потоку D рядок fizz.
//        Потік B викликає buzz(), щоб перевірити, чи ділиться число на 5, і якщо так - додати в чергу на виведення для потоку D рядок buzz.
//        Потік C викликає fizzbuzz(), щоб перевірити, чи ділиться число на 3 та 5 одночасно, і якщо так - додати в чергу на виведення для потоку D рядок fizzbuzz.
//        Потік D викликає метод number(), щоб вивести наступне число з черги, якщо є таке число для виведення.