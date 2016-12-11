package figures;

/**
 * Created by marvinpiekarek on 25/11/2016.
 */
public class Rectangle extends Figure{

    double length;

    double width;

    public Rectangle(Point anker, double len, double wid) {
        super(anker);
        length = len;
        width = wid;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
    }
}
