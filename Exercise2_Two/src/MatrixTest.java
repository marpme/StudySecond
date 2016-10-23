// imports

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Matrix Test-Class (mathematics matrix)
 * [100 % test coverage as of 23. Oct. 2016]
 * @author Marvin Piekarek
 */
public class MatrixTest {

    private Matrix m;

    /**
     * Define setUp to create a new Matrix for all methods.
     *
     */
    @Before
    public void setUp() {
        m = new Matrix(new float[][]{{3, 5}, {4, 1}});
    }


    /**
     * Constructor Exception test with a non-squared array
     */
    @Test
    public void constructorExceptionTest() {
        boolean exp = false;

        try {
            new Matrix(new float[][]{{3, 5}, {4, 1, 5}});
        } catch (IndexOutOfBoundsException e) { exp = true; }

        assertTrue(exp);
    }

    /**
     * Test if the same, as the setUp Matrix, is resolved as equal.
     */
    @Test
    public void equalsTrueTest() {
        Matrix a = new Matrix(new float[][]{{3, 5}, {4, 1}});
        boolean b = m.equals(a);
        assertTrue(b);
    }

    /**
     * The equal test with false numbers
     */
    @Test
    public void equalsFalseNumbersTest() {
        Matrix a = new Matrix(new float[][]{{3, 1}, {4, 1}});
        boolean b = m.equals(a);
        assertTrue(!b);
    }

    /**
     * Equal test with wrong dimensions
     */
    @Test
    public void equalsFalseDimensionsTest() {
        Matrix a = new Matrix(new float[][]{{3, 1}, {4, 1}, {22, 22}});
        boolean b = m.equals(a);
        assertTrue(!b);
    }

    /**
     * add test (normal)
     */
    @Test
    public void addNormalTest() {
        Matrix a = new Matrix(new float[][]{{1, 2}, {4, 6}});
        Matrix c = m.add(a);
        Matrix erg = new Matrix(new float[][]{{4, 7}, {8, 7}});
        System.out.println(c.toString());
        assertTrue(erg.equals(c));
    }


    /**
     * add exception test with different dimensions (normal)
     */
    @Test
    public void addExceptionTest() {
        boolean exp = false;

        try {
            Matrix a = new Matrix(new float[][]{{1, 2, 2}, {4, 6, 1}});
            m.add(a);
        } catch (IndexOutOfBoundsException e) { exp = true; }

        assertTrue(exp);
    }

    /**
     * Multiply with normals scalar
     */
    @Test
    public void multiplyNormalTest() {
        Matrix e = new Matrix(new float[][]{{6, 10}, {8, 2}});
        Matrix erg = m.multiplyScalar(2);
        assertTrue(erg.equals(e));
    }

    /**
     * Multiply with normals scalar
     */
    @Test
    public void multiplyNegativeTest() {
        Matrix e = new Matrix(new float[][]{{-6, -10}, {-8, -2}});
        Matrix erg = m.multiplyScalar(-2f);
        assertTrue(erg.equals(e));
    }

    /**
     * Multiply with null scalar
     */
    @Test
    public void multiplyNullTest() {
        Matrix e = new Matrix(new float[][]{{0, 0}, {0, 0}});
        Matrix erg = m.multiplyScalar(0f);
        assertTrue(erg.equals(e));
    }

    /**
     * Multiply with one scalar
     */
    @Test
    public void multiplyOneTest() {
        Matrix e = new Matrix(new float[][]{{3, 5}, {4, 1}});
        Matrix erg = m.multiplyScalar(1f);
        assertTrue(erg.equals(e));
    }


    /**
     * Normal matrices multiply test
     */
    @Test
    public void multiplyTest() {
        Matrix a = new Matrix(new float[][]{{2, 2}, {2, 2}, {2, 2}});
        Matrix b = new Matrix(new float[][]{{1, 2, 1}, {2, 1, 2}});
        Matrix c = a.multiply(b);
        Matrix d = new Matrix(new float[][]{{6, 6, 6}, {6, 6, 6}, {6, 6, 6}});
        assertArrayEquals(c.getComponents(), d.getComponents());
    }

    /**
     * Harder matrices multiply test (more dimensions)
     */
    @Test
    public void multiplyHardTest() {
        Matrix a = new Matrix(new float[][]{{2, 2, 1}, {2, 2, 2}, {2, 2, 3}, {0, 3, 9}});
        Matrix b = new Matrix(new float[][]{{1, 2, 1, 8}, {2, 1, 2, 2}, {3, 5, 9, 1}});
        Matrix c = a.multiply(b);
        Matrix d = new Matrix(new float[][]{{9, 11, 15, 21}, {12, 16, 24, 22}, {15, 21, 33, 23}, {33, 48, 87, 15}});
        assertArrayEquals(c.getComponents(), d.getComponents());
    }

    /**
     * Multiply Exception because of different dimensions.
     */
    @Test
    public void multiplyExceptionTest() {
        boolean exp = false;
        try{
            Matrix a = new Matrix(new float[][]{{2, 2, 1}, {2, 2, 2}, {2, 2, 3}, {0, 3, 9}});
            Matrix b = new Matrix(new float[][]{{1, 2, 1, 8}, {2, 1, 2, 2}});
            a.multiply(b);
        }catch(ArithmeticException e){ exp = true; }

        assertTrue(exp);
    }
}