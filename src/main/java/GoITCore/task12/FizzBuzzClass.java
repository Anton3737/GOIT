package GoITCore.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FizzBuzzClass {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    private int n;
    private BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public FizzBuzzClass(int n) {
        this.n = n;
    }

    public void fizz() throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            if (i % 5 != 0) {
                queue.put(ANSI_GREEN + "fizz" + ANSI_RESET);
            }
        }
    }

    public void buzz() throws InterruptedException {
        for (int i = 5; i <= n; i += 5) {
            if (i % 3 != 0) {
                queue.put(ANSI_GREEN + "buzz" + ANSI_RESET);
            }
        }
    }

    public void fizzbuzz() throws InterruptedException {
        for (int i = 15; i <= n; i += 15) {
            queue.put(ANSI_GREEN + "fizzbuzz" + ANSI_RESET);
        }
    }

    public void number() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                if (i % 3 != 0 && i % 5 != 0) {
                    System.out.println(ANSI_GREEN + i + ANSI_RESET);
                } else {
                    System.out.println(queue.take());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        FizzBuzzClass fizzBuzz = new FizzBuzzClass(15);

        List<Thread> threadList = new ArrayList<>();

        Thread threadA = new Thread(() -> {
            try {
                fizzBuzz.fizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                fizzBuzz.buzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                fizzBuzz.number();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadList.add(threadA);
        threadList.add(threadB);
        threadList.add(threadC);
        threadList.add(threadD);


        try {
            int tmp = 1;
            for (Thread ThrStr : threadList) {
                ThrStr.start();
                System.out.println(ANSI_PURPLE + "Thread " + tmp + " was start" + ANSI_RESET);
                tmp++;
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        try {
            int tmp = 1;
            for (Thread ThrStr : threadList) {
                ThrStr.join();
                System.out.println(ANSI_YELLOW + "Thread " + tmp + " is join" + ANSI_RESET);
                tmp++;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            int tmp = 1;
            for (Thread ThrStr : threadList) {
                System.out.println(ANSI_RED + "Thread " + tmp + " is Alive ? " + ThrStr.isAlive() + ANSI_RESET);
                tmp++;
            }
        }
    }
}
