package figures;

/**
 * Created by marvinpiekarek on 25/11/2016.
 */
public class Quadrat extends Figure {

    double len;

    public Quadrat(Punkt anker, double len) {
        super(anker);
        this.len = len;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    @Override
    public double calculateExtent() {
        return len * 4;
    }

    @Override
    public double calculateArea() {
        return len * len;
    }
}
