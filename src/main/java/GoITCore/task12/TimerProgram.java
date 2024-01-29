package GoITCore.task12;

class SecondTimerThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {

            System.out.println("секунда " + i);
            try {
                sleep(1000);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class EveryFiveSecondThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(5000);
                System.err.println("Настала 5 та секунда");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TimerProgram {
    public static void main(String[] args) {
        SecondTimerThread timeThread = new SecondTimerThread();
        EveryFiveSecondThread messageThread = new EveryFiveSecondThread();
        timeThread.start();
        messageThread.start();
    }
}


//        Завдання 1
//        Напишіть програму, яка кожну секунду відображає на екрані дані про час, що минув від моменту запуску програми.
//        Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.
