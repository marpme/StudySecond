import abstractDatatypes.list.List;
import abstractDatatypes.queue.Queue;
import abstractDatatypes.stack.Stack;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 22. Dec 2016
 */
public class Main {
    public static void main(String[] args) {
        List a = new List();
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

        Stack b = new Stack();
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

        Queue c = new Queue();
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
