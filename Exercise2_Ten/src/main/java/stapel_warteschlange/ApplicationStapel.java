package stapel_warteschlange;

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
        Stapel<Float> a = new Stapel<Float>();
        Stapel<Integer> b = new Stapel<Integer>();

        a.push(1.3F);
        a.push(242.0F);
        a.push(11.111F);

        b.push(2);
        b.push(5);
        b.push(0);

        System.out.println("Stack Integer:");
        System.out.println(b);
        System.out.println(b.pop());
        System.out.println(b.top());
        System.out.println(b.isEmpty());
        System.out.println(b);

        System.out.println();

        System.out.println("Stack Float:");
        System.out.println(a);
        System.out.println(a.pop());
        System.out.println(a.top());
        System.out.println(a.isEmpty());
        System.out.println(a);

    }

}
