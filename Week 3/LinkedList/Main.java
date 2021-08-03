import java.util.Arrays;

public class Main {
	public static boolean testConstructor() {
		// Test 1 - no argument constructor
		LinkedList list1 = new LinkedList();
		if(list1.size() != 0) {
			System.out.println("No argument constructor size incorrect");
			return false;
		}
		// Test 2 - one argument constructor
		Node node = new Node(5);
		LinkedList list2 = new LinkedList(node);
		if(list2.size() != 1) {
			System.out.println("One argument constructor size incorrect");
			return false;
		}
		return true;
	}
	
	public static boolean testAdd() {
		// Test 1 - adding null node to linked list
		LinkedList list = new LinkedList();
		list.add(null);
		if(list.size() != 0) {
			System.out.println("Adding null value to linked list test failed");
			return false;
		}
		// Test 2 - add to empty linked list
		Node node1 = new Node(1);
		list.add(node1);
		if(list.size() != 1) {
			System.out.println("Adding a node to empty linked list test failed");
			return false;
		}
		// Test 3 - add to linked list with one node
		Node node2 = new Node(2);
		list.add(node2);
		if(list.size() != 2) {
			System.out.println("Adding a node to a linked list with one node test"
					+ " failed");
			return false;
		}
		// Test 4 - add to linked list with more than one node
		Node node3 = new Node(3);
		list.add(node3);
		if(list.size() != 3) {
			System.out.println("Adding a node to a linked list with more than one "
					+ "node test failed");
			return false;
		}
		return true;
	}

	public static boolean testToString() {
		// Test 1 - empty linked list
		LinkedList list = new LinkedList();
		if(!list.toString().equals("Linked List is empty")) {
			System.out.println("toString method on empty linked list test failed");
			System.out.println("Expected output : Linked List is empty");
			System.out.println("Your output: " + list.toString());
			return false;
		}
		// Test 2 - linked list with one node
		Node node1 = new Node(1);
		list.add(node1);
		if(!list.toString().equals("1")) {
			System.out.println("toString method on linked list with one node "
					+ "test failed");
			System.out.println("Expected output : 1");
			System.out.println("Your output: " + list.toString());
			return false;
		}
		// Test 3 - linked list with more than one node
		Node node2 = new Node(3);
		Node node3 = new Node(5);
		list.add(node2);
		list.add(node3);
		if(!list.toString().equals("1, 3, 5")) {
			System.out.println("toString method on linked list with more than one node "
					+ "test failed");
			System.out.println("Expected output : 1, 3, 5");
			System.out.println("Your output: " + list.toString());
			return false;
		}
		return true;
	}

	public static boolean testContains() {
		// Test 1 - Passing null node as argument
		LinkedList list = new LinkedList();
		if(list.contains(null) != false) {
			System.out.println("contains() method using null as argument test failed");
			return false;
		}
		// Test 2 - Calling contains() method on empty linked list
		Node node1 = new Node(1);
		if(list.contains(node1) != false) {
			System.out.println("contains() method on empty linked list test failed");
			return false;
		}
		// Test 3 - Node is not in linked list
		list.add(node1);
		Node node2 = new Node(2);
		if(list.contains(node2) != false) {
			System.out.println("contains() method on non-empty linked list "
					+ "with a node not in the linked list as argument test failed");
			return false;
		}
		// Test 4 - Node is at the head of linked list
		if(list.contains(node1) != true) {
			System.out.println("contains() method on non-empty linked list "
					+ "with a node at the head of linked list test failed");
			return false;
		}
		// Test 5 - Node is at the tail of linked list
		list.add(node2);
		if(list.contains(node2) != true) {
			System.out.println("contains() method on non-empty linked list "
					+ "with a node at the tail of linked list test failed");
			return false;
		}
		// Test 6 - Node is at the middle of linked list
		Node node3 = new Node(3);
		list.add(node3);
		if(list.contains(node2) != true) {
			System.out.println("contains() method on non-empty linked list "
					+ "with a node at the middle of linked list test failed");
			return false;
		}
		return true;
	}
	
	public static boolean testGet() {
		// Test 1 - get() on invalid index
		LinkedList list = new LinkedList();
		Node node1 = new Node(1);
		if(list.get(0) != null) {
			System.out.println("get() method with invalid index test failed");
			return false;
		}
		// Test 2 - get() on head of linked list
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		if(list.get(0) != node1) {
			System.out.println("get() method with head index test failed");
			return false;
		}
		// Test 3 - get() on middle of linked list
		if(list.get(1) != node2) {
			System.out.println("get() method with middle index test failed");
			return false;
		}
		// Test 4 - get() on tail of linked list
		if(list.get(3) != node4) {
			System.out.println("get() method with tail index test failed");
			return false;
		}
		return true;
	}

	public static boolean testClear() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		// Test 1 - call clear() method with one node in linked list
		LinkedList list1 = new LinkedList(node1);
		list1.clear();
		if(list1.size() != 0) {
			System.out.println("size after calling clear() method with one node in"
					+ " linked list incorrect");
			return false;
		}
		// Test 2 - call clear() method with five node in linked list
		LinkedList list2 = new LinkedList(node1);
		list2.add(node2);
		list2.add(node3);
		list2.add(node4);
		list2.add(node5);
		list2.clear();
		if(list2.size() != 0) {
			System.out.println("size after calling clear() method with two node in"
					+ " linked list incorrect");
			return false;
		}
		if(node1.getNext() != null || node2.getNext() != null ||
				node3.getNext() != null || node4.getNext() != null) {
			System.out.println("Nodes that were cleared from linked list \'next\'"
					+ "attribute not reset to null");
			return false;
		}
		return true;
	}

	public static boolean testDelete() {
		// Test 1 - call delete() method with invalid index
		LinkedList list = new LinkedList();
		if(list.delete(0) != null) {
			System.out.println("delete() method with invalid index test failed");
			return false;
		}
		// Test 2 - delete the only node in the linked list
		Node node1 = new Node(1);
		list.add(node1);
		if(list.delete(0) != node1) {
			System.out.println("delete() method with only one node in linked list"
					+ " test failed");
			return false;
		}
		if(list.size() != 0) {
			System.out.println("size of linked list after deleting the only node "
					+ "in the linked list incorrect");
			return false;
		}
		// Test 3 - delete the tail of the linked list
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		list.add(node5);
		if(list.delete(4) != node5) {
			System.out.println("delete() method with the tail as index test failed");
			return false;
		}
		if(list.size() != 4) {
			System.out.println("size of linked list after deleting the tail of"
					+ " linked list incorrect");
			return false;
		}
		if(node4.getNext() != null) {
			System.out.println("\'next\' attribute of deleted "
					+ "node not updated to null");
			return false;
		}
		// Test 4 - delete the middle of the linked list
		if(list.delete(1) != node2) {
			System.out.println("delete() method with the middle as index test failed");
			return false;
		}
		if(list.size() != 3) {
			System.out.println("size of linked list after deleting the middle of"
					+ " linked list incorrect");
			return false;
		}
		if(node1.getNext() != node3) {
			System.out.println("\'next\' attribute of previous node of deleted "
					+ "node not updated to the correct node");
			return false;
		}
		if(node2.getNext() != null) {
			System.out.println("\'next\' attribute of deleted node "
					+ "node not updated to null");
			return false;
		}
		// Test 5 - delete the head of the linked list
		if(list.delete(0) != node1) {
			System.out.println("delete() method with the head as index test failed");
			return false;
		}
		if(list.size() != 2) {
			System.out.println("size of linked list after deleting the head of"
					+ " linked list incorrect");
			return false;
		}
		if(node1.getNext() != null) {
			System.out.println("\'next\' attribute of deleted node "
					+ "node not updated to null");
			return false;
		}
		return true;
	}
	
	public static boolean testInsert() {
		// Test 1 - use null node as argument for insert() method
		Node node1 = new Node(1);
		LinkedList list = new LinkedList();
		list.insert(0, null);
		if(list.size() != 0) {
			System.out.println("Size of linked list after passing null"
					+ " node as argument test failed");
			return false;
		}
		// Test 2 - passing invalid index as argument
		Node node2 = new Node(2);
		list.insert(2, node2);
		if(list.size() != 0) {
			System.out.println("Size of linked list after passing illegal index"
					+ " as argument test failed");
			return false;
		}
		// Test 3 - insert to a empty linked list
		list.insert(0, node1);
		if(list.size() != 1) {
			System.out.println("Size of linked list after node to an empty linked "
					+ "list incorrect");
			return false;
		}
		// Test 4 - insert at the tail of linked list
		list.insert(1, node2);
		if(list.size() != 2) {
			System.out.println("Size of linked list after inserting node at "
					+ "tail incorrect");
			return false;
		}
		if(node1.getNext() != node2) {
			System.out.println("The \'next\' attribute of the node before the"
					+ " inserted node is not updated correctly");
			return false;
		}
		// Test 5 - insert at the head of linked list
		Node node3 = new Node(3);
		list.insert(0, node3);
		if(list.size() != 3) {
			System.out.println("Size of linked list after inserting node at "
					+ "head incorrect");
			return false;
		}
		if(node3.getNext() != node1) {
			System.out.println("The \'next\' attribute of the inserted node is not "
					+ "updated correctly");
			return false;
		}
		if(!list.toString().equals("3, 1, 2")) {
			System.out.println("Expected sequence after inserting a node at the "
					+ "head of linked list not as expected");
			System.out.println("Expected output: 3, 1, 2");
			System.out.println("Your output: " + list);
			return false;
		}
		// Test 6 - insert at the middle of linked list
		Node node4 = new Node(4);
		list.insert(1, node4);
		if(list.size() != 4) {
			System.out.println("Size of linked list after inserting node at "
					+ "middle incorrect");
			return false;
		}
		if(node4.getNext() != node1) {
			System.out.println("The \'next\' attribute of the inserted node is not "
					+ "updated correctly");
			return false;
		}
		if(node3.getNext() != node4) {
			System.out.println("The \'next\' attribute of the node before the"
					+ " inserted node is not updated correctly");
			return false;
		}
		if(!list.toString().equals("3, 4, 1, 2")) {
			System.out.println("Expected sequence after inserting a node at the "
					+ "middle of linked list not as expected");
			System.out.println("Expected output: 3, 4, 1, 2");
			System.out.println("Your output: " + list);
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructor test: " + testConstructor());
		System.out.println("Add() method test: " + testAdd());
		System.out.println("toString() method test: " + testToString());
		System.out.println("contains() method test: " + testContains());
		System.out.println("get() method test: " + testGet());
		System.out.println("clear() method test: " + testClear());
		System.out.println("delete() method test: " + testDelete());
		System.out.println("insert() method test: " + testInsert());
	}

}
