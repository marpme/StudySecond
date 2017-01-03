package collections.stack;

/**
 * Short tests for stack
 * Included in collections.stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class ApplicationStapel {

    public static void main(String[] args) {
        Stapel b = new Stapel();

        b.push(1);
        b.push(2);
        b.push(3);
        b.push(4);
        b.push(5);
        System.out.println(b);

        System.out.println(b.pop());
        System.out.println(b);

        System.out.println(b.top());
        System.out.println(b);

        System.out.println();

    }

}
