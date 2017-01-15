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
public class Warteschlange<E> extends Liste<E> {

    public Warteschlange(E object){
        super();
        this.addFirst(object);
    }

    public Warteschlange(){
        super();
    }

    public void enqueue(E object){
        this.addFirst(object);
    }

    public E dequeue(){
        if(isEmpty()) return null;
        return this.removeLast();
    }

    public E first(){
        if(isEmpty())
            return null;
        return this.get(this.size()-1);
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }

}
