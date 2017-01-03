package collections.stack;

/**
 * Class description ...
 * Included in collections.stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public interface StapelSchnittstelle {

    /**
     * legt ein Element (mit einem gegebenen Wert) oben auf den Stapel
     * @param a ein integer der hinzugefügt werden soll
     */
    void push(int a);

    /**
     * liefert den Wert des obersten Elements des Stacks zurück
     * @return den obersten Wert des Stacks
     * @throws NullPointerException wenn kein element vorhanden ist.
     */
    int top() throws NullPointerException;

    /**
     * nimmt das oberste Element vom Stapel herunter und gibt seinen Wert zurück
     * @return das oberste Element des Stacks
     * @throws NullPointerException wenn leer
     */
    int pop() throws NullPointerException;

    /**
     * liefert true zurück, wenn der Stapel leer ist
     * @return true wenn leer und false wenn befüllt.
     */
    public boolean isEmpty();
}
