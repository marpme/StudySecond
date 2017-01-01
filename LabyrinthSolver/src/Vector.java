/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 24. Dec 2016
 */
public class Vector {
    public int x,y;

    public Vector() {
        x = 0;
        y = 0;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (x != vector.x) return false;
        return y == vector.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Vector add(Vector k){
        Vector a = new Vector();
        a.x = k.x + this.x;
        a.y = k.y + this.y;
        return a;
    }

    public static Vector leftMove(){
        return new Vector(-1, 0);
    }

    public static Vector rightMove(){
        return new Vector(1, 0);
    }

    public static Vector topMove(){
        return new Vector(0,1);
    }

    public static Vector bottomMove(){
        return new Vector(0, -1);
    }

}


