package collections.queue;

import collections.list.Liste;

/**
 * Warteschlange(Warteschlange)
 * Included in collections.queue
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class Warteschlange extends Liste implements WarteschlangenSchnittstellen {

    /**
     * fügt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
     *
     * @param a an integer value
     */
    @Override
    public void enqueue(int a) {
        super.addLast(a);
    }

    /**
     * entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zurück
     *
     * @return int
     */
    @Override
    public int dequeue() {
        return removeFirst();
    }

    /**
     * liefert den Wert des ersten Elements der Warteschlange zurück
     *
     * @return integer
     */
    @Override
    public int first() {
        return get(size());
    }

    /**
     * liefert true zurück, wenn die Warteschlange leer ist
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    /**
     * toString methode
     * @return ein String des Objektes
     */
    @Override
    public String toString() {
        String a = "<--- ";
        for (int i = 1; i <= size(); i++) {
            a += get(i) + " ";
        }
        a += "<---";
        return a;
    }
}
