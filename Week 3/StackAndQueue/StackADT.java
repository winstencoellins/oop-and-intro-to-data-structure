
public interface StackADT {
	/*
	 * Pushes a value into stack
	 * If stack is full, you would want to output
	 * "Stack Overflow, can't add [value] into the stack"
	 */
	public void push(int value);
	
	/*
	 * Pops the value from the stack
	 * @return the value popped from the stack
	 */
	public String pop();
	
	/*
	 * @return the length of the stack that is filled with value
	 */
	public int top();
	
	/*
	 * @return true if stack is empty, else otherwise
	 */
	public boolean isEmpty();
	
	/*
	 * @return the last value inserted into the stack
	 */
	public int peek();
}