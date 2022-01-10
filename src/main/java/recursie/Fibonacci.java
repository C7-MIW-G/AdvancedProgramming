package recursie;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * bereken fibonacci zowel recursief als iteratief
 */
public class Fibonacci {

    public static void main(String[] args) {
        int fibVan = 20;

        long startTijd = System.nanoTime();
        System.out.println(fibonacciIteratief(fibVan));
        System.out.println("verwerkingstijd = " + (System.nanoTime() - startTijd));
        startTijd = System.nanoTime();
        System.out.println(fibonacciRecursief(fibVan));
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
        int[] fibonnaciReeks = new int[index + 1];
        fibonnaciReeks[0] = 1;
        fibonnaciReeks[1] = 1;

        for (int i = 2; i < index + 1; i++) {
            fibonnaciReeks[i] = fibonnaciReeks[i-1] + fibonnaciReeks[i-2];
        }

        return fibonnaciReeks[index];
    }

}
