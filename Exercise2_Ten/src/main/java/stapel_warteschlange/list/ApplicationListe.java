package stapel_warteschlange.list;

/**
 * Short tests for list.
 * Included in collections.list
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 03. Jan 2017
 */
public class ApplicationListe {
    public static void main(String[] args) {
        Liste<Integer> a = new Liste<Integer>();

        a.addFirst(2);
        a.addFirst(324);
        a.addLast(33);
        a.addLast(111);
        a.addLast(14214);

        a.add(11,2);
        a.add(0,1);

        System.out.println(a.size());
        a.add(100,a.size());

        System.out.println(a);
        System.out.println(a.removeFirst());
        System.out.println(a.removeFirst());
        System.out.println(a.remove(33));

        System.out.println(a);
        System.out.println(a.removeLast());
        System.out.println(a);

        System.out.println(a.removeAtIndex(2));
        System.out.println(a);

        System.out.println(a.removeAtIndex(1));
        System.out.println(a);

        System.out.println();
    }
}
