package stack;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class Stack<T> implements Stackable<T> {

    private Node head;

    private int counter;

    private class Node{
        T data;
        Node next;
    }

    /**
     * @param data
     */
    @Override
    public void push(T data) {
        Node memorized = head;
        head = new Node();
        head.data = data;
        head.next = memorized;
        counter++;
    }

    /**
     * @return
     */
    @Override
    public T pop() {

        if(head != null){
            T retObj = head.data;
            head = head.next;
            counter--;
            return retObj;
        }

        return null;
    }

    /**
     * @return
     */
    @Override
    public T peek() {
        return head != null ? head.data : null;
    }

    /**
     * @return
     */
    @Override
    public int getSize() {
        return counter;
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     *
     */
    @Override
    public void clear() {
        counter = 0;
    }

    /**
     *
     */
    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
