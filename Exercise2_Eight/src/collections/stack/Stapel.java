package collections.stack;

import collections.list.Liste;
import collections.list.Node;

/**
 * Stapel aka. Stapel
 * Included in collections.stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class Stapel extends Liste implements StapelSchnittstelle {

    /**
     * Ctor
     */
    public Stapel() {
        super();
    }

    /**
     * Ctor
     * @param a integer as init value
     */
    public Stapel(int a) {
        super(a);
    }

    /**
     * Ctor
     * @param a Node as first node
     */
    public Stapel(Node a) {
        super(a);
    }

    /**
     * legt ein Element (mit einem gegebenen Wert) oben auf den Stapel
     * @param a int to push on the stack
     */
    @Override
    public void push(int a){
        this.addFirst(a);
    }

    /**
     * liefert den Wert des obersten Elements des Stacks zurück
     * @return den obersten Wert des Stacks
     * @throws NullPointerException wenn kein element vorhanden ist.
     */
    @Override
    public int top() throws NullPointerException{
        if(this.isEmpty()){
            throw new NullPointerException("Peek is not valid on an empty collections.stack.");
        }

        return this.get(1);

    }

    /**
     * nimmt das oberste Element vom Stapel herunter und gibt seinen Wert zurück
     * @return das oberste Element des Stacks
     * @throws NullPointerException wenn leer
     */
    @Override
    public int pop() throws NullPointerException {
        if(this.isEmpty()){
            throw new NullPointerException("Pop is not valid on an empty collections.stack.");
        }

        return this.removeFirst();
    }

    /**
     * liefert true zurück, wenn der Stapel leer ist
     * @return true wenn leer und false wenn nicht leer
     */
    @Override
    public boolean isEmpty(){
        return this.size() == 0;
    }

    /**
     * ToString Methode
     * @return ein String der das aktuelle obj beschreibt.
     */
    @Override
    public String toString() {
        String a = "";
        for (int i = 1; i <= size(); i++){
            a += "** " + super.get(i) + " **\n";
        }
        a += "*******";
        return a;
    }
}
