package abstractDatatypes.list;

/**
 * Class description ...
 * Included in abstractDatatypes.list
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class List implements AbstrakteListe {

    /**
     *
     */
    private Node head;

    /**
     *
     */
    private int counter = 0;

    /**
     *
     * @param a
     */
    public List(int a) {
        this.head = new Node(a);
        this.counter = 1;
    }

    /**
     *
     * @param a
     */
    public List(Node a) {
        this.head = a;
        this.counter = 1;
    }

    /**
     *
     */
    public List() {
        head = null;
    }

    /**
     * Berechnet die Länge der List
     *
     * @return Länge der List
     */
    @Override
    public int size() {
        return counter;
    }

    /**
     * prüft, ob ein gegebener Wert in der List vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der List vorhanden
     */
    @Override
    public boolean contains(int wert) {
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
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    @Override
    public int get(int index) throws NullPointerException {
        if(index < 1 || this.size() < index) {
            throw new NullPointerException("Index out of bounds.");
        }

        Node temp = head;
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
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    @Override
    public int set(int wert, int index) throws NullPointerException {
        if(index < 1 || this.size() <= index) {
            throw new NullPointerException("Index out of bounds.");
        }

        Node temp = head;
        int co = 1;
        while(temp != null){
            co++;
            if(index == co){
                int val = temp.data;
                temp.data = wert;
                return val;
            }
            temp = temp.next;
        }

        throw new NullPointerException("Index out of bounds.");
    }

    /**
     * fügt einen Wert an den Anfang der List ein
     *
     * @param wert der einzufügende Wert
     */
    @Override
    public void addFirst(int wert) {
        if(head == null){
            head = new Node(wert);
        }else{
            Node a = new Node(wert);
            a.next = head;
            head = a;
        }
        this.counter++;
    }

    /**
     * fügt einen Wert ans Ende der List ein
     *
     * @param wert der einzufügende Wert
     */
    @Override
    public void addLast(int wert) {

        if(head == null){
            head = new Node(wert);
        } else {
            Node a = new Node(wert);
            Node temp = head;

            while(temp.hasNext()){
                temp = temp.next;
            }

            temp.next = a;
        }
        this.counter++;
    }

    /**
     * fügt einen Wert am gegebenen Index in die List ein
     *
     * @param wert  der einzufügende Wert
     * @param index Index, an dem das neue Element eingefügt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingefügt wurde
     */
    @Override
    public boolean add(int wert, int index) {
        Node temp = head;
        int co = 0;

        if(index <= 1){
            addFirst(wert);
            return true;
        }else if(counter > index){
            while (temp != null) {
                if (index - 1 == co) {
                    Node add = new Node(wert);
                    add.next = temp.next;
                    temp.next = add;
                    this.counter++;
                    return true;
                }
                co++;
            }

        }else if(counter == index){
            addLast(wert);
            return true;
        }

        return false;
    }

    /**
     * entfernt ein Element mit gegebenem Wert aus der List
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der List entfernt wurde
     */
    @Override
    public boolean remove(int wert) {
        if(head == null){
            return false;
        }

        Node temp = head;
        while(temp != null){
            if(temp.hasNext() && temp.next.data == wert){
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    /**
     * entfernt das erste Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    @Override
    public int removeFirst() throws NullPointerException {
        if(head == null){
            throw new NullPointerException("List is already empty.");
        }

        int a = head.data;
        head = head.next;
        this.counter--;
        return a;
    }

    /**
     * entfernt das letzte Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    @Override
    public int removeLast() throws NullPointerException {
        Node temp = head;
        if(temp == null){
            throw new NullPointerException("List is empty.");
        }

        int a;

        while(temp != null){
            if(temp.hasNext() && !temp.next.hasNext()){
                a = temp.next.data;
                temp.next = null;
                this.counter--;
                return a;
            }
            temp = temp.next;
        }
        throw new NullPointerException("wasn't able to remove last ...");
    }

    /**
     * entfernt das Element am gegebenen Index aus der List
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der List nicht vorhanden
     */
    @Override
    public int removeAtIndex(int index) throws NullPointerException {
        if(head == null){
            throw new NullPointerException("List is already empty.");
        }

        if(index <= 1){
            return removeFirst();
        }else if(index == size()){
            return removeLast();
        }else{
            Node temp = head;
            int co = 1;
            while(temp != null){
                if(index - 1 == co){
                    int a = temp.next.data;
                    temp.next = temp.next.next;
                    this.counter--;
                    return a;
                }
                temp = temp.next;
            }
        }

        throw new NullPointerException("Index was out of bounds.");
    }

    /**
     *
     * @return
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
