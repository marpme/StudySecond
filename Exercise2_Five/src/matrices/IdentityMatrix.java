package matrices;

/**
 * Identity class (mathematics matrix)
 *
 * @author Marvin Piekarek
 */
public class IdentityMatrix extends Matrix {

    /**
     * The Identity Matrix constructor
     * @param size int size of the matrix
     */
    public IdentityMatrix(int size) {
        super(size, size);

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (j == i) {
                    setMatrix(1, i, j);
                } else {
                    setMatrix(0, i, j);
                }
            }
        }
    }

    /**
     * Turns the object into a string
     * @return the string
     */
    @Override
    public String toString() {
        return "IdentityMatrix : " + super.toString();
    }

}
