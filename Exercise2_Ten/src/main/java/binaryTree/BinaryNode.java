package binaryTree;

/**
 * Node class for storing left and right node as a pair.
 * Included in binaryTree
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class BinaryNode {

    /**
     * the left node.
     */
    private BinaryNode left;

    /**
     * the right node.
     */
    private BinaryNode right;

    /**
     * the node data.
     */
    private int data;

    /**
     * Ctor with given left and right node and an Integer value.
     * @param left the left node.
     * @param right the right node.
     * @param value an integer value.
     */
    public BinaryNode(BinaryNode left, BinaryNode right, int value){
        this.data = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Ctor with given Integer value
     * left and right node will be null
     */
    public BinaryNode(int a){
        this.data = a;
        this.left = this.right = null;
    }

    /**
     * Ctor with out parameters
     */
    public BinaryNode(){
        this.data = 0;
        this.left = this.right = null;
    }

    /**
     * Gets the right node from the current object.
     * @return null if not present or the node.
     */
    public BinaryNode getRight(){
        return this.right;
    }

    /**
     * Gets the left node from the current object.
     * @return null if not present or the node.
     */
    public BinaryNode getLeft() {
        return this.left;
    }

    /**
     * Gets the data from the current object.
     * @return an Integer value
     */
    public int getData() {
        return data;
    }

    /**
     * Check if a left node is present.
     * @return true if present and false if not.
     */
    public boolean hasLeft(){
        return this.left != null;
    }

    /**
     * Check if a right node is present.
     * @return true if present and false if not.
     */
    public boolean hasRight(){
        return this.right != null;
    }

    /**
     * Check if a left and right node is null (Leave requirement)
     * @return true if none is present and false if one of them is.
     */
    public boolean isLeave(){
        return (this.right == null) && (this.left == null);
    }

    /**
     * Checks if the current node is sorted (k > left) && (k < right)
     * @return true if sorted and false if not.
     */
    public boolean isSorted(){
        if(this.isLeave()){
            return true;
        }else if(this.hasLeft() && this.hasRight()){
            if(this.data >= this.getLeft().getData() && this.data <= this.getRight().getData()) return true;
        }else if(this.hasLeft()){
            if(this.data >= this.getLeft().getData()) return true;
        }else if(this.hasRight()){
            if(this.data <= this.getRight().getData()) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data=" + data +
                '}';
    }
}
