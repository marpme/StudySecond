package stapel_warteschlange.list;

/**
 * Integer Liste (collection) which starts at index 1 to index x
 * Included in collections.list
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class Liste<E> implements AbstrakteListe<E> {

    /**
     *  Header node
     */
    private Node<E> head;

    /**
     * integer size of list
     */
    private int size = 0;

    /**
     * Ctor with first int
     * @param a init integer value
     */
    public Liste(E a) {
        this.addFirst(a);
    }

    /**
     * Ctor with a init node
     * @param a a node
     */
    public Liste(Node a) {
        this.head = a;
        this.size = 1;
    }

    /**
     *  Ctor for empty list
     */
    public Liste() {
        head = null;
    }

    /**
     * Berechnet die Länge der Liste
     *
     * @return Länge der Liste
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * prüft, ob ein gegebener Wert in der Liste vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der Liste vorhanden
     */
    @Override
    public boolean contains(E wert) {
        Node temp = head;

        while(temp != null){
            if(temp.data == wert){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    /**
     * gibt den Wert eines Elementes am gegebenen Index zurück (Lesen)
     *
     * @param index gefragter Index
     * @return Wert des Elements am gefragten Index
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    @Override
    public E get(int index) throws NullPointerException {
        if(index < 1 || this.size() < index) {
            throw new NullPointerException("Index out of bounds.");
        }

        Node<E> temp = head;
        int co = 1;
        while(temp != null){
            if(index == co){
                return temp.data;
            }
            temp = temp.next;
            co++;
        }

        throw new NullPointerException("Index not part of bounds.");
    }

    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten überschriebenen Wert des Elements zurück
     *
     * @param wert  neuer Wert
     * @param index Index, an dem der Wert überschrieben werden soll
     * @return alter überschriebener Wert
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    @Override
    public E set(E wert, int index) throws NullPointerException {
        if(index < 1 || this.size() <= index) {
            throw new NullPointerException("Index out of bounds.");
        }

        Node<E> temp = head;
        int co = 1;
        while(temp != null){
            co++;
            if(index == co){
                E val = temp.data;
                temp.data = wert;
                return val;
            }
            temp = temp.next;
        }

        throw new NullPointerException("Index out of bounds.");
    }

    /**
     * fügt einen Wert an den Anfang der Liste ein
     *
     * @param wert der einzufügende Wert
     */
    @Override
    public void addFirst(E wert) {
        if(head == null){
            head = new Node<E>(wert);
        }else{
            Node a = new Node<E>(wert);
            a.next = head;
            head = a;
        }
        this.size++;
    }

    /**
     * fügt einen Wert ans Ende der Liste ein
     *
     * @param wert der einzufügende Wert
     */
    @Override
    public void addLast(E wert) {

        if(head == null){
            head = new Node<E>(wert);
        } else {
            Node a = new Node<E>(wert);
            Node temp = head;

            while(temp.hasNext()){
                temp = temp.next;
            }

            temp.next = a;
        }
        this.size++;
    }

    /**
     * fügt einen Wert am gegebenen Index in die Liste ein
     *
     * @param wert  der einzufügende Wert
     * @param index Index, an dem das neue Element eingefügt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingefügt wurde
     */
    @Override
    public boolean add(E wert, int index) {
        Node temp = head;
        int co = 0;

        if(index <= 1){
            addFirst(wert);
            return true;
        }else if(size > index){
            while (temp != null) {
                if (index - 1 == co) {
                    Node add = new Node<E>(wert);
                    add.next = temp.next;
                    temp.next = add;
                    this.size++;
                    return true;
                }
                co++;
            }

        }else if(size == index){
            addLast(wert);
            return true;
        }

        return false;
    }

    /**
     * entfernt ein Element mit gegebenem Wert aus der Liste
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der Liste entfernt wurde
     */
    @Override
    public boolean remove(E wert) {
        if(head == null){
            return false;
        }else if(head.data == wert){
            if(head.hasNext()){
                head = head.next;
                return true;
            }else{
                head = null;
                return true;
            }
        }else{
            Node temp = head;
            while(temp != null){
                if(temp.hasNext() && temp.data == wert){
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    /**
     * entfernt das erste Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    @Override
    public E removeFirst() throws NullPointerException {
        if(head == null){
            throw new NullPointerException("Liste is already empty.");
        }

        E a = head.data;
        head = head.next;
        this.size--;
        return a;
    }

    /**
     * entfernt das letzte Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    @Override
    public E removeLast() throws NullPointerException {
        Node<E> temp = head;
        if(temp == null){
            throw new NullPointerException("Liste is empty.");
        }

        E a;

        while(temp != null){
            if(temp.hasNext() && !temp.next.hasNext()){
                a = temp.next.data;
                temp.next = null;
                this.size--;
                return a;
            }
            temp = temp.next;
        }
        throw new NullPointerException("wasn't able to remove last ...");
    }

    /**
     * entfernt das Element am gegebenen Index aus der Liste
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden
     */
    @Override
    public E removeAtIndex(int index) throws NullPointerException {
        if(head == null){
            throw new NullPointerException("Liste is already empty.");
        }

        if(index <= 1){
            return removeFirst();
        }else if(index == size()){
            return removeLast();
        }else{
            Node<E> temp = head;
            int co = 1;
            while(temp != null){
                if(index - 1 == co){
                    E a = temp.next.data;
                    temp.next = temp.next.next;
                    this.size--;
                    return a;
                }
                temp = temp.next;
            }
        }

        throw new NullPointerException("Index was out of bounds.");
    }

    /**
     * to string method
     * @return a string of the object.
     */
    @Override
    public String toString() {
        String a = "[";
        Node temp = head;
        while(temp != null){
            a += " " + temp.data;
            temp = temp.next;
        }
        return  a + " ]";
    }

}
