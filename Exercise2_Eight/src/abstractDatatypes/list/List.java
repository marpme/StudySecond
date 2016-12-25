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
     * @return L�nge der List
     */
    @Override
    public int size() {
        return counter;
    }

    /**
     * pr�ft, ob ein gegebener Wert in der List vorhanden ist
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
        if(index < 0 || this.size() <= index) {
            throw new NullPointerException("Index out of bounds.");
        }

        Node temp = head;
        int co = 0;
        while(temp != null){
            co++;
            if(index == co){
                return head.data;
            }
            temp = temp.next;
        }

        throw new NullPointerException("Index not part of bounds.");
    }

    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten �berschriebenen Wert des Elements zur�ck
     *
     * @param wert  neuer Wert
     * @param index Index, an dem der Wert �berschrieben werden soll
     * @return alter überschriebener Wert
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    @Override
    public int set(int wert, int index) throws NullPointerException {
        if(index < 0 || this.size() <= index) {
            throw new NullPointerException("Index out of bounds.");
        }

        Node temp = head;
        int co = 0;
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
     * f�gt einen Wert an den Anfang der List ein
     *
     * @param wert der einzuf�gende Wert
     */
    @Override
    public void addFirst(int wert) {
        Node a = new Node(wert);
        a.next = head;
        head = a;
        counter++;
    }

    /**
     * f�gt einen Wert ans Ende der List ein
     *
     * @param wert der einzuf�gende Wert
     */
    @Override
    public void addLast(int wert) {
        Node a = new Node(wert);
        Node temp = head;

        while(hasNext(temp)){
            temp = temp.next;
        }
        counter++;
        temp.next = a;
    }

    /**
     * f�gt einen Wert am gegebenen Index in die List ein
     *
     * @param wert  der einzuf�gende Wert
     * @param index Index, an dem das neue Element eingef�gt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingef�gt wurde
     */
    @Override
    public boolean add(int wert, int index) {
        Node temp = head;
        int co = 0;

        while(temp != null){
            co++;
            if(index-1 == co){
                Node add = new Node(wert);
                add.next = temp.next;
            }
        }
    }

    /**
     * entfernt ein Element mit gegebenem Wert aus der List
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der List entfernt wurde
     */
    @Override
    public boolean remove(int wert) {
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
        return 0;
    }

    /**
     * entfernt das letzte Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    @Override
    public int removeLast() throws NullPointerException {
        return 0;
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
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        // TODO to string
        return "";
    }

    /**
     *
     * @param a
     * @return
     */
    private boolean hasNext(Node a){
        return a.next != null;
    }
}
