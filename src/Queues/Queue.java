package Queues;

public interface Queue<E> {

	
	 void enqueue(E e) throws CapacityReachedException;
	
	 E dequeue() throws QueueEmptyException;
	
	 int size();
	 
	 E front() throws QueueEmptyException;
	
	 boolean isEmpty();
	 
}
