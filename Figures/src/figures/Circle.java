package figures;

/**
 * Class description ...
 * Included in figures
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 09. Dec 2016
 */
public class Circle {

    double r;

    public double calculateCircumference(){
        return (double) 2 * Math.PI * r;
    }

    public double calculateArea(){
        return (double) Math.PI * r * r;
    }

    public double Durchmesser(){
        return this.r * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
