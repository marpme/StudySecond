package matrices;

import java.util.Arrays;

/**
 * Vector class (mathematics matrix)
 *
 * @author Marvin Piekarek
 */
public class Vector extends Matrix {

    /**
     * custom constructor with all vector values and
     * the boolean if it is a row vector
     *
     * @param a vector values
     */
    public Vector(double[] a) {
        super(a.length, 1);

        for (int i = 0; i < super.getMatrix().length; i++) {
            for (int j = 0; j < super.getMatrix()[i].length; j++) {
                super.setMatrix(a[i + j], i, j);
            }
        }
    }

    /**
     * Calculates the length of the vector
     *
     * @return the abs of the vector
     */
    public double length() {
        double len = 0;
        for (double[] a : this.getMatrix()) {
            for (double val : a) {
                len += val * val;
            }
        }
        return Math.sqrt(len);
    }

    /**
     * Turns the object into a string
     *
     * @return
     */
    @Override
    public String toString() {

        String output = "";
        for (double[] a : super.getMatrix()) {
            output +=  Arrays.toString(a) + ", ";
        }

        // build the complete string
        return "Vector{" +
                "rows=" + super.getRows() +
                ", columns=" + super.getColumns() +
                ", Components=" + output +
                '}';
    }

}
