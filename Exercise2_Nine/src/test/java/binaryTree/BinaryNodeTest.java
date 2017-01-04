package binaryTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Binary Node testing class (JUnit4)
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 04. Jan 2017
 */
public class BinaryNodeTest {

    @Test
    public void hasLeft() throws Exception {
        BinaryNode k1, k2;
        k1 = new BinaryNode(new BinaryNode(22), new BinaryNode(33), 22);
        k2 = new BinaryNode(null, new BinaryNode(22), 22);
        assertTrue("This has a left site.", k1.hasLeft());
        assertFalse("This doesn't have a left site.", k2.hasLeft());
    }

    @Test
    public void hasRight() throws Exception {
        BinaryNode k1, k2;
        k1 = new BinaryNode(new BinaryNode(22), new BinaryNode(33), 22);
        k2 = new BinaryNode(new BinaryNode(22), null, 22);
        assertTrue("This has a right site.", k1.hasRight());
        assertFalse("This doesn't have a right site.", k2.hasRight());
    }

    @Test
    public void isLeave() throws Exception {
        // null, null
        BinaryNode k1 = new BinaryNode(2);
        assertTrue(k1.isLeave());
        // k1, null
        BinaryNode k2 = new BinaryNode(k1, null, 2);
        assertFalse(k2.isLeave());
        // null, k1
        BinaryNode k3 = new BinaryNode(null, k1, 2);
        assertFalse(k3.isLeave());
        // k1, k1
        BinaryNode k4 = new BinaryNode(k1, k1, 0);
        assertFalse(k4.isLeave());
    }

    @Test
    public void isSorted() throws Exception {
        // switched sites
        BinaryNode bn = new BinaryNode(new BinaryNode(22),
                new BinaryNode(11), 20);
        assertFalse("Isn't sorted correctly.", bn.isSorted());

        // correct sites
        bn = new BinaryNode(new BinaryNode(22),
                new BinaryNode(33), 30);
        assertTrue("this is sorted correctly.", bn.isSorted());

        // null right site
        bn = new BinaryNode(new BinaryNode(22),
                null, 30);
        assertTrue("this is sorted correctly.", bn.isSorted());

        // null left site
        bn = new BinaryNode(null,
                new BinaryNode(100), 30);
        assertTrue("this is sorted correctly.", bn.isSorted());

        // null complete site
        bn = new BinaryNode(null,
                null, 30);
        assertTrue("this is sorted correctly.", bn.isSorted());

    }

}