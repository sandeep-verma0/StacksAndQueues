package QuestionsStackAndQueues;

import java.util.Stack;

public class ImplementQueuesUsingStacks<E> implements Queue<E> {

	private Stack<E> inbox = new Stack<E>();
	private Stack<E> outbox = new Stack<E>();

	@Override
	public void enqueue(E e) throws CapacityReachedException {
		inbox.push(e);
	}

	@Override
	public E dequeue() throws QueueEmptyException {
		if(outbox.isEmpty()){
			while(!inbox.isEmpty())
				outbox.push(inbox.pop());
		}
		return outbox.pop();
	}

	@Override
	public int size() {
		return inbox.size()+outbox.size();
	}

	@Override
	public E front() throws QueueEmptyException {
		E temp=null;
		if(outbox.isEmpty()){
		    temp=inbox.firstElement();
			return temp;
		}
		return outbox.peek();
	}

	@Override
	public boolean isEmpty() {
		return (inbox.isEmpty() && outbox.isEmpty());
	}

}
