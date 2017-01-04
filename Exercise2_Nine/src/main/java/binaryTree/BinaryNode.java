package binaryTree;

/**
 * Class description ...
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class BinaryNode {

    /**
     *
     */
    private BinaryNode left;

    /**
     *
     */
    private BinaryNode right;

    /**
     *
     */
    private int data;

    /**
     *
     * @param left
     * @param right
     */
    public BinaryNode(BinaryNode left, BinaryNode right, int value){
        this.data = value;
        this.left = left;
        this.right = right;
    }

    /**
     *
     */
    public BinaryNode(int a){
        this.data = a;
        this.left = this.right = null;
    }

    /**
     *
     */
    public BinaryNode(){
        this.data = 0;
        this.left = this.right = null;
    }

    /**
     *
     * @return
     */
    public BinaryNode getRight(){
        return this.right;
    }

    /**
     *
     * @return
     */
    public BinaryNode getLeft() {
        return this.left;
    }

    /**
     *
     * @return
     */
    public int getData() {
        return data;
    }

    /**
     *
     * @return
     */
    public boolean hasLeft(){
        return this.left != null;
    }

    /**
     *
     * @return
     */
    public boolean hasRight(){
        return this.right != null;
    }

    /**
     *
     * @return
     */
    public boolean isLeave(){
        return (this.right == null) && (this.left == null);
    }

    /**
     *
     * @return
     */
    public boolean isSorted(){
        if(this.isLeave()){
            return true;
        }else if(this.hasRight() && this.hasLeft()){
            if(this.data <= right.data && this.data >= left.data) return true;
        }else if(this.hasLeft()){
            if(this.data >= left.data) return true;
        }else if(this.hasRight()){
            if(this.data <= right.data) return true;
        }
        return false;
    }
}
