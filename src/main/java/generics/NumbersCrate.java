package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class NumbersCrate<N extends Number> {
    private List<N> numbers;

    public NumbersCrate() {
        numbers = new ArrayList<>();
    }

    public double sum() {
        double sum = 0;

        for (N number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public double average() {
        return sum() / numbers.size();
    }

}
