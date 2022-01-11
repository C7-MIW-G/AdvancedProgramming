package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class StringPallet {
    List<String> opgeslagenVracht;

    public StringPallet() {
        opgeslagenVracht = new ArrayList<>();
    }

    public void laadVracht(String vracht) {
        opgeslagenVracht.add(vracht);
    }
}
