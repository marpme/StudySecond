package stack;

/**
 * Class description ...
 * Included in stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public interface StapelSchnittstelle {

    /**
     * legt ein Element (mit einem gegebenen Wert) oben auf den Stack
     * @param a
     */
    void push(int a);

    /**
     * liefert den Wert des obersten Elements des Stacks zurück
     * @return
     * @throws NullPointerException
     */
    int top() throws NullPointerException;

    /**
     * nimmt das oberste Element vom Stack herunter und gibt seinen Wert zurück
     * @return
     * @throws NullPointerException
     */
    int pop() throws NullPointerException;

    /**
     * liefert true zurück, wenn der Stack leer ist
     * @return
     */
    public boolean isEmpty();
}
