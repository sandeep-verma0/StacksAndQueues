package QuestionsStackAndQueues;

public class CilentQueueUsingStack {

	public static void main(String[] args) throws CapacityReachedException, QueueEmptyException {

		ImplementQueuesUsingStacks<Integer> queue = new ImplementQueuesUsingStacks<Integer>();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println(queue.front());
		while(!queue.isEmpty())
			System.out.println(queue.dequeue());
		
	}

}
