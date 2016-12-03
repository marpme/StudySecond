package figures;

/**
 * Created by marvinpiekarek on 25/11/2016.
 */
abstract class Figure {

    Punkt anker;

    public Figure(Punkt anker) {
        this.anker = anker;
    }

    public Punkt getAnker() {
        return anker;
    }

    public void setAnker(Punkt anker) {
        this.anker = anker;
    }

    public abstract double calculateExtent();

    public abstract double calculateArea();

}
