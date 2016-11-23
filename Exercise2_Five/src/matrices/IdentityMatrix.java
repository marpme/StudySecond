package matrices;

/**
 * Created by marvinpiekarek on 17/11/2016.
 */
public class IdentityMatrix extends Matrix {

    @Override
    public String toString() {
        return "IdentityMatrix{" +
                super.toString() +
                "}";
    }

    public IdentityMatrix(int size) {
        super(size, size);

        float[][] fill = super.getMatrix();
        for (int i = 0; i < fill.length; i++) {
            for (int j = 0; j < fill[i].length; j++) {
                if (j == i) {
                    fill[i][j] = 1;
                } else {
                    fill[i][j] = 0;
                }
            }
        }
    }

}
