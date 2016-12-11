package figures;

/**
 * Created by marvinpiekarek on 25/11/2016.
 */
abstract class Figure {

    Point anker;

    public Figure(Point anker) {
        this.anker = anker;
    }

    public Point getAnker() {
        return anker;
    }

    public void setAnker(Point anker) {
        this.anker = anker;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "anker=" + anker +
                '}';
    }

    public abstract double calculateCircumference();

    public abstract double calculateArea();

    public void moveAnker(double x, double y){
        this.anker.move(x, y);
    }

}
