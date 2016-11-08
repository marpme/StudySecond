import data.Student;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        Student a = new Student("Marvin", "Piekarek", 556014, 1, 2);
        Student b = new Student("Marcel", "Munce", 1515122, 2, 2);
        Student c = new Student("Ali", "Baba", 32352, 1, 2);

        // Listable<Student> list = new SinglyLinkedList<Student>();
         Listable<Student> list = new DoublyLinkedList<Student>();

        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println(list.get(2));

        list.printAll();

        System.out.println("Size: " + list.getLength());
    }
}
