package Stacks;

public interface Stack<E> {

	
	 void push(E e) throws CapacityReachedException;
	
	 E pop() throws StackEmptyException;
	
	 int size();
	 
	 E top() throws StackEmptyException;
	
	 boolean isEmpty();
	 
}
