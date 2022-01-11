package generics;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Programma om met pallets te spelen
 */
public class PalletLauncher {

    public static void main(String[] args) {
        Pallet<Long, Integer> integerPallet = new Pallet<>(165168742165L);
        integerPallet.laadVracht(5);
//        integerPallet.laadVracht("Dit is een String");
    }
}
