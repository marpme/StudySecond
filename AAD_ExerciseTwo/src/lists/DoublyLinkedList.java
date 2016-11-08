package lists;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class DoublyLinkedList<T> implements Listable<T> {

    private Node head;

    private Node tail;

    private class Node{
        T data;
        Node next;
        Node prev;
    }

    @Override
    public void add(T data) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return (head == null) || (tail == null);
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void printAll() {
        System.out.println(this.getClass().getSimpleName());
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public void insertAt(int index, T data) {

    }
}
