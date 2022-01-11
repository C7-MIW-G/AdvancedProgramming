package generics;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * We vervoer verschillende objecten
 */
public class Pallet<Identifier extends Comparable<Identifier>, Element>
        implements Comparable<Pallet<Identifier, Element>> {
    Identifier identifier;
    Element[] opgeslagenVracht;
    int aantalOpgeslagenElementen;

    public Pallet(Identifier identifier) {
        this.identifier = identifier;
        aantalOpgeslagenElementen = 0;
        this.opgeslagenVracht = (Element[]) new Object[10];
    }

    public void laadVracht(Element vracht) {
        opgeslagenVracht[aantalOpgeslagenElementen++] = vracht;
    }

    @Override
    public int compareTo(Pallet<Identifier, Element> other) {
        return this.identifier.compareTo(other.identifier);
    }
}
