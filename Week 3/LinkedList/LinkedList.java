
public class LinkedList implements LinkedListInterface {
	private Node head;
	private int size;
	
	/**
	 * A no argument constructor that sets the head of the LinkedList to null and
	 * the size to be 0
	 */
	public LinkedList() {
		// TO DO:
	}
	
	/**
	 * A one argument constructor that sets the head of the LinkedList as the node 
	 * passed in the argument and sets the size to be 1
	 * @param head
	 */
	public LinkedList(Node head) {
		// TO DO:
	}
	
	/**
	 * A method to return the size of the LinkedList
	 * @return the size of the LinkedList
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * A method to add a node at the end of the LinkedList
	 */
	@Override
	public void add(Node node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * A method that will return the String representation of the LinkedList
	 * The format of the String will be the value of the nodes separated by comma
	 * Example: Calling toString() on a LinkedList with the sequence 1->2->3 will
	 *     return 1, 2, 3 as a String
	 */
	@Override
	public String toString() {
		// TO DO
		return "";
	}
	
	/**
	 * A method to check whether the LinkedList contains the node passed in the argument
	 * @return true if the node is in the LinkedList and false otherwise
	 */
	@Override
	public boolean contains(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * A method to get the node at the specified index
	 * NOTE: index of LinkedList starts from 0 instead of 1
	 * For example: If the LinkedList is 1->2->3, calling get(1) will return the node
	 *     with the value 2
	 * @return the node in the specified index or return null if the index is invalid
	 */
	@Override
	public Node get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * A method to clear the entire LinkedList
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * A method to delete a node at the specified index
	 * @return the deleted node if the node is successfully deleted and return null
	 *     if the index is invalid
	 */
	@Override
	public Node delete(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * A method to insert a node at the specified index
	 * Example: We called insert(1, node4) where node 4 has the value of 4 
	 *     on a LinkedList with the sequence 1->2->3, will result in the LinkedList
	 *     to be 1->4->2->3
	 * NOTE: Do not insert the node if the index is invalid 
	 */
	@Override
	public void insert(int index, Node node) {
		// TODO Auto-generated method stub
		
	}

}
