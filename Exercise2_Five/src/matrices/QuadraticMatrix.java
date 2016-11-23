package matrices;

/**
 * Created by marvinpiekarek on 17/11/2016.
 */
public class QuadraticMatrix extends Matrix {

    public QuadraticMatrix(float[][] a) {
        super(a.length, a[0].length);
        super.setMatrix(a);
    }

    public Matrix pow(int n) {
        Matrix fin = new QuadraticMatrix(this.getMatrix());

        if (n < 0) {

        } else if (n == 0) {
            return new IdentityMatrix(this.getRows());
        } else {
            for (int i = 0; i < n; i++) {
                fin = fin.multiply(this);
            }
        }
        return fin;
    }

    @Override
    public String toString() {
        return "QuadraticMatrix{" + super.toString() + "}";
    }
}
