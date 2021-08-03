# Week 3 Linked List Assignment
In this assignment, you will be provided with the Node.java class and LinkedListInterface.java interface to help you in the assignment. Your assignment will be to complete a class with the name LinkedList.java that implements LinkedListInterface.java. 

## Steps
Download the Node.java,LinkedListInterface.java, and LinkedList.java files or you can copy and paste the content of the files to new files if you choose to create new files. Review the contents of Node.java class to understand the behavior of the class. You may also experiment using the class on your own before proceeding to the next step.

Next, review the contents of LinkedListInterface.java and make sure you read and understand all the functionality provided. We recommend you to implement the methods in the order provided in the interface as they increase in difficulty and being able to implement the earlier methods will help you in implementing the next methods. 

We have provided the skeleton code for your LinkedList.java class. You will then complete the "TO DO" section of the LinkedList.java class.

### Attributes and Constructors
The LinkedList.java class has 2 attributes which are `head` and `size`. The head will store the address of the first node in the Linked List and size will represent the number of nodes in the list. Next, you will implement the constructors of the class. One of the constructor will contain no argument while the other constructor will contain one argument. 

### Testing
To test your code, create a new java file which contains a main method and create an instance of LinkedList object. 
```java
// Instantiating a LinkedList object with no argument constructor
LinkedList list = new LinkedList();

// Instantiating a LinkedList object with a one argument constructor
Node node1 = new Node(5);
LinkedList list = new LinkedList(node1);
```

### Methods
The first method you will implement will be the size() method which returns the size of the LinkedList.
```java
public int size() {
	// TODO
	return 0;
}
```

After finishing the size() method, you will then implement the add() method which will add a node at the end of the LinkedList.
`NOTE:` Remember to update your size as you add more nodes in the LinkedList and remember to update your head if the initial size of the LinkedList is 0.
Also, a good practice is to check whether the node passed in the argument is null or not. If it is null, do not add the node in the LinkedList.
```java
public void add(Node node) {
	// TODO
}
```

Next, you will implement a toString() method to get a String representation of the LinkedList and aids you in checking your work. The format of the String returned has already been specified as comments in the skeleton code. 
```java
public String toString() {
	// TODO
	return "";
}
```

Then, you will implement the contains() method to check whether a certain node is a part of the LinkedList.
```java
public boolean contains(Node node) {
	// TODO 
	return false;
}
```

After you have successfully implemented the contains() method, you will implement the get() method to get the node at the specified index. 
`NOTE:` The index of the LinkedList starts at 0 which means that get(0) will return the head of the LinkedList.
`NOTE:` Also, check whether the index passed as argument is valid or not. Return null if the index is invalid.
```java
public Node get(int index) {
	// TODO
	return null;
}
```

The next method you will implement will be the clear() method which will clear the entire LinkedList.
`NOTE:` Remember to update the attributes of the LinkedList and the nodes in the LinkedList as needed
`NOTE:` You should reset the `next` attributes of all the nodes in the LinkedList
```java
public void clear() {
	// TODO
}
```

Finally, you will implement the delete() and insert() methods as the last methods that you will implement. 
```java
public Node delete(int index) {
	// TODO
	return null;
}
```
For the delete() method, an index argument will be passed to specify which node will be deleted and the method will return the deleted node if the deletion is successful.
Similar to the get() method, remember to check for invalid index and return null if the index is invalid. 
`NOTE:` Similar to the clear() method, you should update the `next` attribute of the nodes that you will delete. 

```java
public void insert(int index, Node node) {
	// TODO 
}
```
As for the insert() method, it is similar to the add() method except there will be an index argument in the insert() method which enables the method to add the node anywhere in the LinkedList.
Example: Calling insert(0, node1) on a LinkedList with the sequence (node2 -> node3 -> node4) will result in the LinkedList to be (node1 -> node2 -> node3 -> node4)
However, do note that the index can also be invalid. Example: Calling insert(5, node2) with a LinkedList with only 3 nodes will not allow the method to add the node. Hence, the size and content of the LinkedList will stay the same.




