package stapel_warteschlange.list;

public interface AbstrakteListe<E> {
	
	/**
	 * Berechnet die Länge der Liste
	 * @return L�nge der Liste
	 */
	int size();
	

	/**
	 * pr�ft, ob ein gegebener Wert in der Liste vorhanden ist
	 * @param wert gesuchter Wert
	 * @return true, wenn gesuchter Wert in der Liste vorhanden
	 */
	boolean contains(E wert);
	
	
	/**
	 * gibt den Wert eines Elementes am gegebenen Index zur�ck (Lesen)
	 * @param index gefragter Index
	 * @return Wert des Elements am gefragten Index
	 * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
	 */
	E get(int index) throws NullPointerException;
	
	
	/**
	 * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben) 
	 * und gibt den alten �berschriebenen Wert des Elements zur�ck
	 * @param index Index, an dem der Wert �berschrieben werden soll
	 * @param wert neuer Wert
	 * @return alter �berschriebener Wert
	 * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
	 */
	E set(E wert, int index) throws NullPointerException;
	
	
	/**
	 * f�gt einen Wert an den Anfang der Liste ein
	 * @param wert der einzuf�gende Wert
	 */
	void addFirst(E wert);
	
	
	/**
	 * f�gt einen Wert ans Ende der Liste ein
	 * @param wert der einzuf�gende Wert
	 */
	void addLast(E wert);
	
	
	/**
	 * f�gt einen Wert am gegebenen Index in die Liste ein
	 * @param wert der einzuf�gende Wert
	 * @param index Index, an dem das neue Element eingef�gt werden soll
	 * @return true, wenn das Element am gegebenen Index erfolgreich eingef�gt wurde
	 */
	boolean add(E wert, int index);
	
	
	/**
	 * entfernt ein Element mit gegebenem Wert aus der Liste
	 * @param wert zu entfernende Wert
	 * @return true, wenn Element mit gegebenem Wert gefunden und aus der Liste entfernt wurde
	 */
	boolean remove(E wert);
	
	
	/**
	 * entfernt das erste Element aus der Liste
	 * @return Wert des entfernten Elements
	 * @throws NullPointerException wenn Liste leer
	 */
	E removeFirst() throws NullPointerException;
	
	
	/**
	 * entfernt das letzte Element aus der Liste
	 * @return Wert des entfernten Elements
	 * @throws NullPointerException wenn Liste leer
	 */
	E removeLast() throws NullPointerException;

	
	/**
	 * entfernt das Element am gegebenen Index aus der Liste
	 * @param index Index, an dem das Element entfernt werden soll
	 * @return Wert des entfernten Elements
	 * @throws NullPointerException wenn Index in der Liste nicht vorhanden
	 */
	E removeAtIndex(int index) throws NullPointerException;
	
	
	/**
	 * liefert die String-Repräsentation der Liste zurück
	 */
	String toString();
}
