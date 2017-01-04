import binaryTree.BinaryNode;
import binaryTree.BinaryTree;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class EntryBinaryTree {
    public static void main(String[] args) {
        BinaryNode k1, k2, k3;

        k1 = new BinaryNode(new BinaryNode(3), new BinaryNode(19), 14);
        // System.out.println(k1.isSorted());
        k2 = new BinaryNode(new BinaryNode(14), new BinaryNode(18), 17);
        // System.out.println(k2.isSorted());
        k3 = new BinaryNode(k1,k2, 15);

        BinaryTree bt = new BinaryTree(k3);
        System.out.printf("There have been %d counted.%n", bt.countLeavesOfTree());
        System.out.printf("Is the binary tree sorted? - %b%n", bt.isTreeSorted());
    }
}
