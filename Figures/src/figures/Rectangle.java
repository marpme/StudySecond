package figures;

/**
 * Created by marvinpiekarek on 25/11/2016.
 */
public class Rectangle extends Quadrat{

    double width;

    public Rectangle(Punkt anker, double len, double wid) {
        super(anker, len);
        width = wid;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return len * width;
    }

    @Override
    public double calculateExtent() {
        return 2 * len + 2 * width;
    }
}
