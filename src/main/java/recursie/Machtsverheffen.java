package recursie;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * zowel iteratief als recursief machtsverheffen
 */
public class Machtsverheffen {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("2 ^ %2d = %4d | %4d\n", i, totDeMachtIteratief(2, i), totDeMachtRecursief(2, i));
        }
    }

    public static int totDeMachtIteratief(int basis, int macht) {
        int resultaat = 1;

        for (int i = 0; i < macht; i++) {
            resultaat *= basis;
        }

        return resultaat;
    }

    public static int totDeMachtRecursief(int basis, int macht) {
        if (macht == 0) {
            return 1;
        } else if (macht > 0) {
            return basis * totDeMachtRecursief(basis, macht - 1);
        } else {
            return totDeMachtRecursief(basis, macht + 1) / basis;
        }
    }

}
