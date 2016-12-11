package figures;

/**
 * Created by marvinpiekarek on 25/11/2016.
 */
public class Quadrat extends Rectangle {

    public Quadrat(Point anker, double len) {
        super(anker, len, len);
    }

    public double getLen() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Quadrat{} " + super.toString();
    }

    public void setLen(double len) {
        this.setLength(len);
    }

    @Override
    public double calculateCircumference() {
        return super.getLength() * 4;
    }

    @Override
    public double calculateArea() {
        return super.getLength() * super.getLength();
    }
}
