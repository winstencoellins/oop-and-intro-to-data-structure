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

After finishing the size() method, you will then implement the add() method which will add a node at the end of the LinkedList.
NOTE: Remember to update your size as you add more nodes in the LinkedList and remember to update your head if the initial size of the LinkedList is 0.
Also, a good practice is to check whether the node passed in the argument is null or not. If it is null, do not add the node in the LinkedList.

Next, you will implement a toString() method to get a String representation of the LinkedList and aids you in checking your work. The format of the String returned has already been specified as comments in the skeleton code. 




