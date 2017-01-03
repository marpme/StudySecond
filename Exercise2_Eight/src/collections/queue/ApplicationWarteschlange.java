package collections.queue;

/**
 * Short tests for queue
 * Included in collections.queue
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class ApplicationWarteschlange {

    public static void main(String[] args) {
        Warteschlange c = new Warteschlange();

        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);

        System.out.println(c);
        System.out.println(c.dequeue());

        c.enqueue(6);

        System.out.println(c);
    }

}
