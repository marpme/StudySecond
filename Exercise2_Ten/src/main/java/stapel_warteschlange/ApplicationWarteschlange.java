package stapel_warteschlange;

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
        Warteschlange<Double> a = new Warteschlange<Double>();
        Warteschlange<Character> b = new Warteschlange<Character>();

        a.enqueue(0.00000000D);
        a.enqueue(242.0D);
        a.enqueue(11.111D);

        b.enqueue('A');
        b.enqueue('c');
        b.enqueue('p');

        System.out.println("Queue Double:");
        System.out.println(b);
        System.out.println(b.dequeue());
        System.out.println(b.first());
        System.out.println(b.isEmpty());
        System.out.println(b);

        System.out.println();

        System.out.println("Queue Character:");
        System.out.println(a);
        System.out.println(a.dequeue());
        System.out.println(a.first());
        System.out.println(a.isEmpty());
        System.out.println(a);
    }

}
