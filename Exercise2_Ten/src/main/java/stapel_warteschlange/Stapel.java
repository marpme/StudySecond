package stapel_warteschlange;

import stapel_warteschlange.list.Liste;

/**
 * Class description ...
 * Included in stapel_warteschlange
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 08. Jan 2017
 */
public class Stapel<E> extends Liste<E> {

    public Stapel(E object) {
        super();
        this.addFirst(object);
    }

    public Stapel() {
        super();
    }

    public void push(E object) {
        this.addFirst(object);
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return this.removeFirst();
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return this.get(0);
    }

    public boolean isEmpty() {
        return this.isEmpty();
    }

}
