
public interface LinkedListInterface {
	public int size(); // return the size of the LinkedList
	public void add(Node node); // add a Node to the end of the LinkedList
	public String toString(); // Print all the nodes value separated by comma
	public boolean contains(Node node); // Check whether the node is contained in the
		// LinkedList
	public Node get(int index); //  Get the node at the specified index
	public void clear(); // Clear the entire LinkedList, remember to set the
		// next value of all nodes to null
	public Node delete(int index); // Delete a node in the LinkedList corresponding to
		// the index given in the argument
	public void insert(int index, Node node); // Insert a node at the specified index
}
