package collections.list;

/**
 * Node for storing single values and their next node
 */
public class Node {

	/**
	 * data integer
	 */
	int data;

	/**
	 * Next node
	 */
	Node next;

	/**
	 * to-String methode
	 * @return string of the object
	 */
	@Override
	public String toString() {
		return "Node{" +
				"data=" + data +
				", next=" + next +
				'}';
	}

	/**
	 * Ctor with start int
	 * @param d Integer value
	 */
	public Node(int d) {
		data = d;
		next = null;
	}

	/**
	 * Looks if there is a next a node or if null.
	 * @return false if next is null or true if there is next.
	 */
	public boolean hasNext(){
		return this.next != null;
	}
}
