package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class description ...
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class BinaryTree {

    /**
     *
     */
    private BinaryNode root;

    /**
     *
     */
    public BinaryTree() {
        this.root = null;
    }

    /**
     *
     * @param root
     */
    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    /**
     *
     * @return
     */
    public boolean isNotEmpty(){
        return this.root != null;
    }

    /**
     *
     * @return
     */
    public int countLeavesOfTree(){
        return countLeaves(root);
    }

    /**
     *
     * @param k
     * @return
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

    public boolean isTreeSorted(){
        return isSorted(root);
    }

    /**
     *
     * @return
     */
    private boolean isSorted(BinaryNode k){
        if(k.isLeave()) return true;

        boolean nSort = k.isSorted();
        if(k.hasLeft())
            nSort = nSort && isSorted(k.getLeft());
        if(k.hasRight())
            nSort = nSort && isSorted(k.getRight());

        return nSort;
    }

}
