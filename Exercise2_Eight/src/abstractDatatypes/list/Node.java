package abstractDatatypes.list;

/**
 *
 */
public class Node {

	/**
	 *
	 */
	int data;

	/**
	 *
	 */
	Node next;

	@Override
	public String toString() {
		return "Node{" +
				"data=" + data +
				", next=" + next +
				'}';
	}

	/**
	 * CTOR
	 * @param d Integer value
	 */
	public Node(int d) {
		data = d;
		next = null;
	}

	public boolean hasNext(){
		return this.next != null;
	}
}
