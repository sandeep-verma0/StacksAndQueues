package Queues;

public class ClientLinkedListQueue {
	
	public static void main(String[] args) {

	   LinkedListQueue<Integer> stack = new LinkedListQueue<Integer>();
	   
	   stack.enqueue(10);
	   stack.enqueue(20);
	   stack.enqueue(30);
	   stack.enqueue(40);
	   stack.enqueue(50);
	   
	   try {
		System.out.println(stack.front());
	} catch (QueueEmptyException e1) {
		e1.printStackTrace();
	}
	   int size = stack.size;
	   for(int i=0;i<size;i++){
		   try {
			System.out.println(stack.dequeue());
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
	   }
	}
}
