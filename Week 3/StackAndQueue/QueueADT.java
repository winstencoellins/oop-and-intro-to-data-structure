
public interface QueueADT {
	/*
	 * Adds a value into queue
	 */
	public void enqueue(int value);
	
	/*
	 * Remove the first element from the queue and move every single 
	 * existing value to the front by 1 index
	 */
	public void dequeue();
	
	/*
	 * @return the first element that is in the queue
	 */
	public int peek();
	
	/*
	 * @return true if queue is empty, else otherwise
	 */
	public boolean isEmpty();
}
