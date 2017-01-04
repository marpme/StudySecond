package binaryTree;

/**
 * Binary tree class to structure data as a tree.
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class BinaryTree {

    /**
     * the root node.
     */
    private BinaryNode root;

    /**
     * Ctor with no parameters
     * Root node will be an empty node.
     */
    public BinaryTree() {
        this.root = new BinaryNode();
    }

    /**
     * Ctor with root node
     * @param root the root node.
     */
    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    /**
     * Checks if a binary tree is empty by checking the root node.
     * @return true if empty and false if filled.
     */
    public boolean isNotEmpty(){
        return this.root != null;
    }

    /**
     * Wrapper method for countLeaves (with root node)
     * @return integer of counted leaves.
     */
    public int countLeavesOfTree(){
        return countLeaves(root);
    }

    /**
     * Counting leaves at a giving starting point.
     * @param k the starting node.
     * @return integer value of counted leaves.
     */
    private int countLeaves(BinaryNode k){
        if(k.isLeave()){
            return 1;
        }
        int left = 0, right = 0;

        if(k.hasLeft())
            left = countLeaves(k.getLeft());
        if(k.hasRight())
            right = countLeaves(k.getRight());

        return left + right;
    }

    /**
     * Public wrapper for isSorted, with root node
     * @return true if sorted and false if not.
     */
    public boolean isTreeSorted(){
        return isSorted(root);
    }

    /**
     * Check if the current node is sorted.
     * @return true if sorted and false if not.
     */
    private boolean isSorted(BinaryNode k){
        if(k == null)
            return false;
        else if(k.isLeave())
            return true;

        boolean nSort = k.isSorted();
        if(k.hasLeft())
            nSort = nSort && isSorted(k.getLeft());
        if(k.hasRight())
            nSort = nSort && isSorted(k.getRight());

        return nSort;
    }

}
