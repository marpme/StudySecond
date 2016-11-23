package matrices;

import java.util.Arrays;

/**
 * Matrix Class (mathematics matrix)
 *
 * @author Marvin Piekarek
 */
public class Matrix {


    /**
     * contains the rows count
     */
    private int rows;

    /**
     * contains the columns count
     */
    private int columns;

    /**
     * Stores every value of the matrix
     */
    private float[][] matrix;


    /**
     * Getter for n
     *
     * @return n as Integer
     */
    public int getRows() {
        return rows;
    }

    /**
     * Getter for m
     *
     * @return m as Integer
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Getter for Matrix components
     *
     * @return components as two-dimensional float-array
     */
    public float[][] getMatrix() {
        return matrix;
    }

    /**
     * Sets every component with the float[][] parameter
     * @param arr float[][]
     */
    public void setMatrix(float[][] arr) {

        for (float[] a : arr) {
            if (a.length != getColumns()) throw new IndexOutOfBoundsException();
        }

        this.matrix = Arrays.copyOf(arr, arr.length);
    }

    /**
     * Sets single components on the matrix array
     * @param val value for the new element
     * @param i higher index
     * @param j lower index
     */
    public void setMatrix(float val, int i, int j) {
        this.matrix[i][j] = val;
    }

    /**
     * custom constructor for the Matrix class
     *
     * @param a two-dimensional float array
     */
    public Matrix(float[][] a) {

        rows = a.length;
        int len = a[0].length;

        /*
            The float-array must have the same deep-dimensions in every upper dimension.
            (squared array needed, otherwise an error will be thrown)
         */
        for (float[] b : a) {
            if (len != b.length) {
                throw new IndexOutOfBoundsException();
            }
        }
        columns = len;

        matrix = Arrays.copyOf(a, a.length);
    }

    /**
     * standard constructor if no parameters are given
     */
    public Matrix() {
        rows = 2;
        columns = 2;
        matrix = new float[][]{{0, 0}, {0, 0}};
    }

    /**
     * Creates Matrix with the size and filled with zeros
     */
    public Matrix(int r, int c) {
        rows = r;
        columns = c;

        float[][] IdMatrix = new float[r][c];

        this.matrix = Arrays.copyOf(IdMatrix, IdMatrix.length);
    }

    /**
     * Checks if the Matrix is equal to another one
     *
     * @param a Matrix which will be compared
     * @return boolean if those are equal
     */
    public boolean equals(Matrix a) {

        if (!isSameDimensions(a)) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (a.getMatrix()[i][j] != matrix[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }

    /**
     * Add to matrices with each other
     *
     * @param second the second matrix
     * @return a new matrix
     */
    public Matrix add(Matrix second) {

        if (!isSameDimensions(second)) {
            throw new IndexOutOfBoundsException();
        }

        float[][] end = new float[this.rows][this.columns];

        // adds all rows and column values to each other
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                end[i][j] = matrix[i][j] + second.matrix[i][j];
            }
        }

        Matrix endMat = new Matrix(end);

        return endMat;
    }

    /**
     * Multiplies a Matrix with a given scalar
     *
     * @param a scalar as float
     * @return the multiplied Matrix
     */
    public Matrix multiplyScalar(float a) {
        float[][] end = Arrays.copyOf(matrix, matrix.length);

        // goes through all values and multiply them with the scalar
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                end[i][j] = matrix[i][j] * a;
            }
        }

        return new Matrix(end);
    }

    /**
     * Multiply two matrices
     *
     * @param a the multiplied matrix
     * @return the new multiplied one
     */
    public Matrix multiply(Matrix a) {
        float[][] end = new float[rows][a.getColumns()];

        // checks if matrix are multipliable
        if (columns == a.rows) {
            // multiplies every float value from rows with the expected column values.
            for (int y = 0; y < a.columns; y++) {
                for (int x = 0; x < rows; x++) {
                    for (int i = 0; i < matrix[x].length; i++) {
                        end[y][x] += (matrix[y][i] * a.matrix[i][x]);
                    }
                }
            }
        } else {
            throw new ArithmeticException();
        }

        return new Matrix(end);
    }

    /**
     * turns the Matrix into a String
     *
     * @return String of Matrix
     */
    @Override
    public String toString() {

        //gets all deep values and turn them into a string
        String output = "";
        for (float[] a : matrix) {
            output += "   " + Arrays.toString(a) + "; \n";
        }

        // build the complete string
        return "Matrix{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", matrix={ \n" + output +
                '}';
    }


    /**
     * Checks if the Matrix has the same dimension as the parameter matrix
     *
     * @param a second matrix which will be checked
     * @return boolean if it has the same dimension
     */
    private boolean isSameDimensions(Matrix a) {
        /*
           there is no need to make a deep scan for different dimensions,
           because the constructor checks it and there is no change in dimensions possible.
         */
        return this.columns == a.getColumns() && this.rows == a.getRows();
    }

}
