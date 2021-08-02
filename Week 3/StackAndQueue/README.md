# Week 3 Assignment Stack and Queue
In this assignment you will be implementing Stack and Queue using interface given for you. Those are `StackADT.java` and `QueueADT.java`.

## Steps
Open the file or download the `StackADT.java` and `QueueADT.java` interfaces. Read through the comments on what you need to do with the function provided in the interface. You will
be implementing Stack and Queue using Fixed Size Array in this assignment. Create two classes called `Stack.java` and `Queue.java`. Copy and paste the code provided for you nelow into
two of the classes you just created.

#### Stack
```java
public class Stack() {
  private int top = 0;
  private int items[];
  private int maxSize;
  
  public Stack(int maxSize){
    // TODO: implement the constructor
  }
}
```

After copying and pasting the code above into your class now is your time to implement it. `Stack.java` will implements the interface called `StackADT.java`. Every single time a
`Stack` object is created, a stack object will have it's own array with the maxSize provided. As an example:
```java
Stack stk = new Stack(5);
```
will create an array with five `0` values in it. `0` means that the stack has nothing in it. The visualization of the code above should be like this:
```
[0, 0, 0, 0, 0]
```
If we add something to the Stack, it should look like this:
```java
Stack stk = new Stack(5);

stk.push(4);
```
```
[4, 0, 0, 0, 0]
```
therefore, when we call the function `top()`, it should return `1` since we only have one value in it. Another example is:
```java
Stack stk = new Stack(5);

stk.push(10);
stk.push(20);
stk.push(30); // [10, 20, 30, 0, 0]

stk.pop(); // If you do System.out.println(stk.pop()); -> it returns 30 with String data type
```
```
[10, 20, 0, 0, 0]
```
Finally, in your `Stack` class, you would want to add one attribute called `printString()` that outputs the condition of the array like the output above. Without the `printString`
function, you will not able to output for example `[10, 20, 0, 0, 0]` from the code above. The output above is only for you to visualize how it should look like, however, to output
it to the console you would want to use `printString()` function.
```java
public void printString(){
  // Code here
}
```

#### Queue
```java
public class Queue() {
  private int index = 0;
  private int items[];
  private int maxSize;
  
  public Queue(int maxSize){
    // TODO: implement the constructor
  }
}
```
The same thing goes for `Queue`. As an example:
```java
Queue q = new Queue(5);
```
```
[0, 0, 0, 0, 0]
```
```java
Queue q = new Queue(5);

q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
```
```
[10, 20, 30, 40, 0]
```
If we continue from the code above to `dequeue` the `queue`, it will look like this:
```java
q.dequeue();
```
```
[20, 30, 40, 0, 0]
```
The same thing also goes for `Queue`, you would want to implement the `printString()` function in order to output your queue to console.

