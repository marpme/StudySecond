package binaryTree;

import stapel_warteschlange.Stapel;
import stapel_warteschlange.Warteschlange;

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
    public boolean isEmpty(){
        return this.root == null;
    }

    /**
     * Traverse the binary tree by going into depth first.
     */
    public void depthFirst(){
        Stapel<BinaryNode> deepness = new Stapel<BinaryNode>();
        BinaryNode node = root;

        // first get down to the last left
        while(node != null){
            deepness.push(node);
            node = node.getLeft();
        }

        while(deepness.size() > 0){

            node = deepness.pop();
            System.out.println(node);

            if(node.hasRight()){
                node = node.getRight();
                while(node != null){
                    deepness.push(node);
                    node = node.getLeft();
                }
            }
        }
    }

    /**
     * Traverse the binary tree by going into breadth first.
     */
    public void breadthFirst(){
        Warteschlange<BinaryNode> breadth = new Warteschlange<BinaryNode>();
        BinaryNode node = root;
        breadth.enqueue(node);

        while(!breadth.isEmpty()){
            node = breadth.dequeue();
            System.out.println(node);

            if(node.hasLeft())
                breadth.enqueue(node.getLeft());
            if(node.hasRight())
                breadth.enqueue(node.getRight());
        }
    }
}
