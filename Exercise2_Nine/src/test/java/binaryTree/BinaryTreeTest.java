package binaryTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * BinaryTree testing class (JUnit4)
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 04. Jan 2017
 */
public class BinaryTreeTest {

    @Test
    public void isNotEmpty() throws Exception {
        BinaryTree bt = new BinaryTree(null);
        assertFalse(bt.isNotEmpty());

        BinaryNode k = new BinaryNode(22);
        bt = new BinaryTree(k);
        assertTrue(bt.isNotEmpty());
    }

    @Test
    public void countLeavesOfTree() throws Exception {
        BinaryNode k1, k2, k3;
        k1 = new BinaryNode(new BinaryNode(3), new BinaryNode(19), 14);
        k2 = new BinaryNode(new BinaryNode(14), new BinaryNode(18), 17);
        k3 = new BinaryNode(k1,k2, 15);
        BinaryTree bt = new BinaryTree(k3);

        assertEquals("Leaves count must be 4", 4, bt.countLeavesOfTree());

        // mixed
        k1 = new BinaryNode(new BinaryNode(3), null, 14);
        k2 = new BinaryNode(null, new BinaryNode(18), 17);
        k3 = new BinaryNode(k1,k2, 15);
        bt = new BinaryTree(k3);

        assertEquals("Leaves count must be 2", 2, bt.countLeavesOfTree());
    }

    @Test
    public void isTreeSorted() throws Exception {
        BinaryNode k1, k2, k3;
        BinaryTree bt;
        //given example tree
        k1 = new BinaryNode(new BinaryNode(1), new BinaryNode(3), 2);
        k2 = new BinaryNode(k1, new BinaryNode(5), 4);
        k3 = new BinaryNode(new BinaryNode(8), null, 9);
        BinaryNode finalNode = new BinaryNode(k2, k3, 7);
        bt = new BinaryTree(finalNode);

        assertTrue("The given example should be sorted.",bt.isTreeSorted());

        // sorted one
        k1 = new BinaryNode(new BinaryNode(3), new BinaryNode(19), 14);
        k2 = new BinaryNode(new BinaryNode(14), new BinaryNode(18), 17);
        k3 = new BinaryNode(k1,k2, 15);
        bt = new BinaryTree(k3);

        assertTrue("The first example should be sorted.",bt.isTreeSorted());

        // left/right wrong
        k1 = new BinaryNode(new BinaryNode(19), new BinaryNode(3), 17);
        k2 = new BinaryNode(new BinaryNode(18), new BinaryNode(14), 14);
        k3 = new BinaryNode(k1,k2, 15);
        bt = new BinaryTree(k3);

        assertFalse("The second example shouldn't be sorted.",bt.isTreeSorted());

        // no right site wrong
        k1 = new BinaryNode(new BinaryNode(3), new BinaryNode(19), 14);
        //k2 = new BinaryNode(new BinaryNode(18), new BinaryNode(14), 14);
        k3 = new BinaryNode(k1,null, 15);
        bt = new BinaryTree(k3);

        assertTrue("The third example should be sorted.", bt.isTreeSorted());

        //just the root node
        k1 = new BinaryNode();
        bt = new BinaryTree(k1);
        assertTrue("Root example should be sorted.", bt.isTreeSorted());

        // empty tree
        bt = new BinaryTree();
        assertTrue("Binary should be sorted since it is empty.", bt.isTreeSorted());
    }

}