package matrices;

import java.util.Arrays;

/**
 * Created by marvinpiekarek on 17/11/2016.
 */
public class Vector extends Matrix {

    /**
     * contains a true if it is a row vector
     */
    boolean isRowVector;

    /**
     * custom constructor with all vector values and
     * the boolean if it is a row vector
     *
     * @param a           vector values
     * @param isRowVector boolean
     */
    public Vector(float[] a, boolean isRowVector) {
        super(a.length, 1);

        this.isRowVector = isRowVector;

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
        for (float[] a : this.getMatrix()) {
            for (float val : a) {
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
        for (float[] a : super.getMatrix()) {
            if (isRowVector) {
                output += Arrays.toString(a) + ", ";
            } else {
                output += " " + Arrays.toString(a) + ", \n";
            }
        }

        // build the complete string
        return "Vector{" +
                "rows=" + super.getRows() +
                ", columns=" + super.getColumns() +
                ", Components= \n" + output + "\n" +
                '}';
    }

}
