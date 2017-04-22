package Queues;

public class ClientArray {

	
		public static void main(String[] args) throws QueueEmptyException, Queues.CapacityReachedException {

			ArrayQueue<Integer> stack = new ArrayQueue<Integer>(10);
			stack.enqueue(10);
			stack.enqueue(20);
			stack.enqueue(30);
			stack.enqueue(40);
			stack.enqueue(50);
			
			int size =stack.size();
			System.out.println("front is " + stack.front());
			System.out.println("size is " + stack.size());
			for(int i=0;i<size;i++)
				System.out.println(stack.dequeue());
		}
}
