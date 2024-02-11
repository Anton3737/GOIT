package GoITDeveloper.Leason5;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class FibonacciDinamic {

    static MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();


    /**
     * Просторова складність: O(n) - лінійна, оскільки використовується масив фіксованого розміру n.
     * Часова складність: O(n) - лінійна, оскільки цикл виконується n-1 раз.
     */

    public static int fibonacciDynamic(int n) {
        int[] fibArr = new int[n + 1];
        fibArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        return fibArr[n];
    }

    public static void main(String[] args) {
        long startMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacciDynamic(100));
        long endTime = System.currentTimeMillis();
        long endMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        System.out.println("Час виконання методу: " + (endTime - startTime) + " мс");
        System.out.println("Обсяг використаної пам'яті: " + (endMemory - startMemory) + " байт");
    }

}
