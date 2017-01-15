package binaryTree;

/**
 * Class description ...
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 15. Jan 2017
 */
public class ApplicationBinaryTree {
    public static void main(String[] args) {
        BinaryNode k1, k2, k3;
        k1 = new BinaryNode(new BinaryNode(1), new BinaryNode(3), 2);
        k2 = new BinaryNode(k1, new BinaryNode(5), 4);
        k3 = new BinaryNode(new BinaryNode(8), null, 9);
        BinaryNode finalNode = new BinaryNode(k2, k3, 7);
        BinaryTree bt = new BinaryTree(finalNode);
        bt.depthFirst();

        System.out.println();

        bt.breadthFirst();
    }
}
