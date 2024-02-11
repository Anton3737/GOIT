package GoITDeveloper.Leason5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

import static GoITDeveloper.Leason5.FibonacciDinamic.memoryMXBean;

public class FobonacciRecirsion {

    static MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();


    /**
     * Просторова складність: O(n) - лінійна, через рекурсивні виклики, кожен з яких займає пам'ять.
     * Часова складність: O(2^n) - експоненціальна, оскільки для кожного числа виконується два рекурсивних виклики.
     */


    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {

        long startMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacciRecursive(10000));
        long endTime = System.currentTimeMillis();
        long endMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        System.out.println("Час виконання методу: " + (endTime - startTime) + " мс");
        System.out.println("Обсяг використаної пам'яті: " + (endMemory - startMemory) + " байт");
    }

}
