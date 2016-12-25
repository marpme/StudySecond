package abstractDatatypes.stack;

import abstractDatatypes.list.List;
import abstractDatatypes.list.Node;

/**
 * Class description ...
 * Included in abstractDatatypes.stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class Stack extends List implements StapelSchnittstelle {

    /**
     * Ctor
     */
    public Stack() {
        super();
    }

    /**
     * Ctor
     * @param a
     */
    public Stack(int a) {
        super(a);
    }

    /**
     * Ctor
     * @param a
     */
    public Stack(Node a) {
        super(a);
    }

    /**
     * legt ein Element (mit einem gegebenen Wert) oben auf den Stack
     * @param a
     */
    @Override
    public void push(int a){
        this.addFirst(a);
    }

    /**
     * liefert den Wert des obersten Elements des Stacks zurück
     * @return
     * @throws NullPointerException
     */
    @Override
    public int top() throws NullPointerException{
        if(this.isEmpty()){
            throw new NullPointerException("Peek is not valid on an empty abstractDatatypes.stack.");
        }

        return this.get(0);

    }

    /**
     * nimmt das oberste Element vom Stack herunter und gibt seinen Wert zurück
     * @return
     * @throws NullPointerException
     */
    @Override
    public int pop() throws NullPointerException {
        if(this.isEmpty()){
            throw new NullPointerException("Pop is not valid on an empty abstractDatatypes.stack.");
        }

        return this.removeFirst();
    }

    /**
     * liefert true zurück, wenn der Stack leer ist
     * @return
     */
    @Override
    public boolean isEmpty(){
        return this.size() == 0;
    }
}
