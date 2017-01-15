import binaryTree.BinaryNode;
import binaryTree.BinaryTree;

/**
 * Entry binary tree - ad-hoc testing purposes.
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class EntryBinaryTree {

    public static void main(String[] args) {
        BinaryNode k1, k2, k3;

        // TODO: false example!!!!!

        k1 = new BinaryNode(new BinaryNode(3), new BinaryNode(8), 5);
        // System.out.println(k1.isSorted());
        k2 = new BinaryNode( 15);
        // System.out.println(k2.isSorted());
        k3 = new BinaryNode(k1,k2, 7);

        BinaryTree bt = new BinaryTree(k3);
        System.out.printf("There have been %d counted.%n", bt.countLeavesOfTree());
        System.out.printf("Is the binary tree sorted? - %b%n", bt.isTreeSorted());
    }

}
