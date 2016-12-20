package stack;

import list.Liste;
import list.Node;

/**
 * Class description ...
 * Included in stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class Stack extends Liste implements StapelSchnittstelle {

    /**
     *
     */
    public Stack() {
        super();
    }

    /**
     *
     * @param a
     */
    public Stack(int a) {
        super(a);
    }

    /**
     *
     * @param a
     */
    public Stack(Node a) {
        super(a);
    }

    /**
     *
     * @param a
     */
    @Override
    public void push(int a){
        this.addFirst(a);
    }

    /**
     *
     * @return
     * @throws NullPointerException
     */
    @Override
    public int top() throws NullPointerException{
        if(this.isEmpty()){
            throw new NullPointerException("Peek is not valid on an empty stack.");
        }

        return this.get(0);

    }

    /**
     *
     * @return
     * @throws NullPointerException
     */
    @Override
    public int pop() throws NullPointerException {
        if(this.isEmpty()){
            throw new NullPointerException("Pop is not valid on an empty stack.");
        }

        return this.removeFirst();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty(){
        return this.size() == 0;
    }
}
