package matrices;

import java.util.Arrays;

/**
 * Matrix Class (mathematics matrix)
 *
 * @author Marvin Piekarek
 */
public class Matrix {

    //region fields

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
    private double[][] matrix;

    //endregion

    //region getter/setter
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
     * @return components as two-dimensional double-array
     */
    public double[][] getMatrix() {
        return matrix.clone();
    }

    /**
     * Sets every component with the double[][] parameter
     * @param arr double[][]
     */
    public void setMatrix(double[][] arr) {

        for (double[] a : arr) {
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
    public void setMatrix(double val, int i, int j) {
        this.matrix[i][j] = val;
    }
    //endregion

    //region constructor
    /**
     * custom constructor for the Matrix class
     *
     * @param a two-dimensional double array
     */
    public Matrix(double[][] a) {

        rows = a.length;
        int len = a[0].length;

        /*
            The double-array must have the same deep-dimensions in every upper dimension.
            (squared array needed, otherwise an error will be thrown)
         */
        for (double[] b : a) {
            if (len != b.length) {
                throw new IndexOutOfBoundsException();
            }
        }
        columns = len;

        matrix = Arrays.copyOf(a, a.length);
    }

    /**
     * Creates Matrix with the size and filled with zeros
     */
    public Matrix(int r, int c) {
        if( (r <= 0 || c <= 0) || (r == 1 && c == 1) ){
            throw new IllegalArgumentException("Matrix size must be higher than 0 and not 1x1!");
        }

        rows = r;
        columns = c;

        double[][] IdMatrix = new double[r][c];

        this.matrix = Arrays.copyOf(IdMatrix, IdMatrix.length);
    }

    /**
     * standard constructor if no parameters are given
     */
    public Matrix() {
        rows = 2;
        columns = 2;
        matrix = new double[][]{{0, 0}, {0, 0}};
    }
    //endregion

    //region public methods
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

        double[][] end = new double[this.rows][this.columns];

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
     * @param a scalar as double
     * @return the multiplied Matrix
     */
    public Matrix multiplyScalar(double a) {
        double[][] end = Arrays.copyOf(matrix, matrix.length);

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
        double[][] end = new double[rows][a.getColumns()];

        // checks if matrix are multipliable
        if (columns == a.rows) {
            // multiplies every double value from rows with the expected column values.
            for (int y = 0; y < a.columns; y++) {
                for (int x = 0; x < rows; x++) {
                    for (int i = 0; i < matrix[x].length; i++) {
                        end[y][x] += (matrix[y][i] * a.matrix[i][x]);
                    }
                }
            }
        } else {
            throw new ArithmeticException("You cannot multiply matrix with wrong dimensions (columns == rows)");
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
        for (double[] a : matrix) {
            output += "   " + Arrays.toString(a) + "; \n";
        }

        // build the complete string
        return "Matrix{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", matrix={ \n" + output +
                '}';
    }
    //endregion

    //region private methods
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
    //endregion

}
