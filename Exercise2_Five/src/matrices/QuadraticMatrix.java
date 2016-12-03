package matrices;

/**
 * QuadraticMatrix class (mathematics matrix)
 *
 * @author Marvin Piekarek
 */
public class QuadraticMatrix extends Matrix {

    /**
     * Constructor for QuadraticMatrix
     * @param a double array
     */
    public QuadraticMatrix(double[][] a) {
        super(a.length);
        super.setMatrix(a);
    }

    /**
     * Calculates the power of the current object
     * @param n value to power the matrix greater than 0
     * @return the powered matrix
     */
    public Matrix pow(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("You must not use negative exponents.");
        }else if (n == 0) {
            return new IdentityMatrix(this.getRows());
        } else {
            Matrix fin = new QuadraticMatrix(this.getMatrix());
            for (int i = 0; i < n; i++) {
                fin = fin.multiply(this);
            }
            return fin;
        }
    }

    /**
     * Turns the object into a string
     * @return string of obj
     */
    @Override
    public String toString() {
        return "QuadraticMatrix : " + super.toString();
    }

}
