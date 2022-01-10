package recursie;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * bereken fibonacci zowel recursief als iteratief
 */
public class Fibonacci {

    public static void main(String[] args) {
        int fibVan = 50;

        long startTijd = System.nanoTime();
        System.out.println(fibonacciIteratief(fibVan));
        System.out.println("verwerkingstijd = " + (System.nanoTime() - startTijd));
        startTijd = System.nanoTime();
        System.out.println(fibonacciRecursiefOptimaal(fibVan));
        System.out.println("verwerkingstijd = " + (System.nanoTime() - startTijd));
    }

    public static int fibonacciRecursief(int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(" ");
        }
        System.out.println(index);
        if (index <= 1) {
            return 1;
        }
        return fibonacciRecursief(index - 1) + fibonacciRecursief(index - 2);
    }

    public static int fibonacciIteratief(int index) {
        int[] fibonacciReeks = new int[index + 1];
        fibonacciReeks[0] = 1;
        fibonacciReeks[1] = 1;

        for (int i = 2; i < index + 1; i++) {
            fibonacciReeks[i] = fibonacciReeks[i-1] + fibonacciReeks[i-2];
        }

        return fibonacciReeks[index];
    }

    public static long fibonacciRecursiefOptimaal(int index) {
        long[] fibonacciReeks = new long[index + 1];
        fibonacciRecursiefOptimaal(index, fibonacciReeks);
        return fibonacciReeks[index];
    }

    private static void fibonacciRecursiefOptimaal(int index, long[] fibonacciReeks) {
        if (index <= 1) {
            // aanname, de eerste twee plekken zijn geïnitialiseerd
            fibonacciReeks[index] = 1;
            return;
        }
        fibonacciRecursiefOptimaal(index - 1, fibonacciReeks);
        fibonacciReeks[index] = fibonacciReeks[index - 2] + fibonacciReeks[index - 1];
    }

}
