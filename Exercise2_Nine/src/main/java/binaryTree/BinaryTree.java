package binaryTree;

/**
 * Class description ...
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(BinaryNode root) {

        this.root = root;
    }

    public boolean isNotEmpty(){
        return true;
    }

    public int countLeaves(){
        return 0x0000;
    }

    public boolean isSorted(){
        return true;
    }
}
