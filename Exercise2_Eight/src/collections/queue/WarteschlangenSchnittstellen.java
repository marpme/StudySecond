package collections.queue;

/**
 * Class description ...
 * Included in collections.queue
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 22. Dec 2016
 */
public interface WarteschlangenSchnittstellen {

    /**
     * fügt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
     * @param a an integer value
     */
    void enqueue(int a);

    /**
     * entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zurück
     * @return integer
     */
    int dequeue();

    /**
     * liefert den Wert des ersten Elements der Warteschlange zurück
     * @return integer
     */
    int first();

    /**
     * liefert true zurück, wenn die Warteschlange leer ist
     * @return boolean
     */
    boolean isEmpty();

}
