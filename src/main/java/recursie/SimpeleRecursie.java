package recursie;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Laat een aantal simpele recursieve voorbeelden zien
 */
public class SimpeleRecursie {

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            System.out.printf("%3d! = %d\n", i, faculteit(i));
//        }
//
//        int[] eenArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(somVanArray(eenArray));
//        System.out.println(somVanArray(eenArray, 2));

        telOp(Integer.MAX_VALUE);
        System.out.println();
    }

    public static int somVanArray(int[] array) {
        return somVanArray(array, array.length - 1);
    }

    private static int somVanArray(int[] array, int totEnMetIndex) {
        if (totEnMetIndex == -1) {
            return 0;
        }
        return array[totEnMetIndex] + somVanArray(array, totEnMetIndex - 1);
    }

    public static void telAf(int getal) {
        System.out.println(getal);
        if (getal > 0) {
            telAf(getal - 1);
        }
    }

    public static int telOp(int aantalGetallen) {
//        if (aantalGetallen <= 0) {
//            return 0;
//        }

        return aantalGetallen + telOp(aantalGetallen - 1);
    }

    public static int telOpIteratief(int aantalGetallen) {
        int som = 0;

        for (int i = 1; i <= aantalGetallen; i++) {
            som += i;
        }

        return som;
    }

    public static long faculteit(int getal) {
        if(getal <= 1) {
            return 1;
        }
        return getal * faculteit(getal - 1);
    }

}
