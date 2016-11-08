package lists;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class SinglyLinkedList<T> implements Listable<T> {

    private Node head;

    private int counter;

    private class Node {
        T data;
        Node next;
    }

    @Override
    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        counter++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        Node temp = head;
        int co = 0;
        while(temp != null){
            co++;
            if(co == index){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int getLength() {
        return counter;
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
