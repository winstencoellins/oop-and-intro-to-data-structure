
public class Node {
	private int value;
	private Node next;
	
	public Node() {
		this.value = 0;
		this.next = null;
	}
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node getNext() {
		return this.next;
	}
}
