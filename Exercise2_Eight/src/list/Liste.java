package list;

/**
 * Class description ...
 * Included in list
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 20. Dec 2016
 */
public class Liste implements AbstrakteListe {

    /**
     *
     */
    private Node kopf;

    /**
     *
     */
    private int counter = 0;

    /**
     *
     * @param a
     */
    public Liste(int a) {
        this.kopf = new Node(a);
        this.counter = 1;
    }

    /**
     *
     * @param a
     */
    public Liste(Node a) {
        this.kopf = a;
        this.counter = 1;
    }

    /**
     *
     */
    public Liste() {
        kopf = null;
    }

    /**
     * Berechnet die Länge der Liste
     *
     * @return L�nge der Liste
     */
    @Override
    public int size() {
        return counter;
    }

    /**
     * pr�ft, ob ein gegebener Wert in der Liste vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der Liste vorhanden
     */
    @Override
    public boolean contains(int wert) {
        Node temp = kopf;

        while(temp != null){
            if(temp.data == wert){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    /**
     * gibt den Wert eines Elementes am gegebenen Index zur�ck (Lesen)
     *
     * @param index gefragter Index
     * @return Wert des Elements am gefragten Index
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    @Override
    public int get(int index) throws NullPointerException {
        return 0;
    }

    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten �berschriebenen Wert des Elements zur�ck
     *
     * @param wert  neuer Wert
     * @param index Index, an dem der Wert �berschrieben werden soll
     * @return alter �berschriebener Wert
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    @Override
    public int set(int wert, int index) throws NullPointerException {
        return 0;
    }

    /**
     * f�gt einen Wert an den Anfang der Liste ein
     *
     * @param wert der einzuf�gende Wert
     */
    @Override
    public void addFirst(int wert) {
        Node a = new Node(wert);
        a.next = kopf;
        kopf = a;
        counter++;
    }

    /**
     * f�gt einen Wert ans Ende der Liste ein
     *
     * @param wert der einzuf�gende Wert
     */
    @Override
    public void addLast(int wert) {
        Node a = new Node(wert);
        Node temp = kopf;

        while(hasNext(temp)){
            temp = temp.next;
        }
        counter++;
        temp.next = a;
    }

    /**
     * f�gt einen Wert am gegebenen Index in die Liste ein
     *
     * @param wert  der einzuf�gende Wert
     * @param index Index, an dem das neue Element eingef�gt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingef�gt wurde
     */
    @Override
    public boolean add(int wert, int index) {
        return false;
    }

    /**
     * entfernt ein Element mit gegebenem Wert aus der Liste
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der Liste entfernt wurde
     */
    @Override
    public boolean remove(int wert) {
        return false;
    }

    /**
     * entfernt das erste Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    @Override
    public int removeFirst() throws NullPointerException {
        return 0;
    }

    /**
     * entfernt das letzte Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    @Override
    public int removeLast() throws NullPointerException {
        return 0;
    }

    /**
     * entfernt das Element am gegebenen Index aus der Liste
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden
     */
    @Override
    public int removeAtIndex(int index) throws NullPointerException {
        return 0;
    }

    @Override
    public String toString() {
        // TODO to string
        return "";
    }

    private boolean hasNext(Node a){
        return a.next != null;
    }
}
