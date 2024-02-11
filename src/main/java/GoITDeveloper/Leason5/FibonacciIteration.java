package GoITDeveloper.Leason5;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class FibonacciIteration {

    static MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();


    /**
     * Просторова складність: O(1) - константна, оскільки використовуються лише дві змінні для обчислень.
     * Часова складність: O(n) - лінійна, де n - номер числа Фібоначчі, оскільки цикл виконується n-1 раз.
     */

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fibPrev = 0, fibCurr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = fibCurr;
            fibCurr = fibPrev + fibCurr;
            fibPrev = temp;

        }
        return fibCurr;
    }

    public static void main(String[] args) {
        long startMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacciIterative(10000));
        long endTime = System.currentTimeMillis();
        long endMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        System.out.println("Час виконання методу: " + (endTime - startTime) + " мс");
        System.out.println("Обсяг використаної пам'яті: " + (endMemory - startMemory) + " байт");

    }

}
