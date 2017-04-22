package Stacks;

public class ClientArray {

	public static void main(String[] args) {

		ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
		try {
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			
		} catch (CapacityReachedException e) {
			
			e.printStackTrace();
		}
		
		int size =stack.size();
		try {
			System.out.println(stack.top());
		} catch (StackEmptyException e1) {
			e1.printStackTrace();
		}
		System.out.println(stack.size());
		for(int i=0;i<size;i++)
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				e.printStackTrace();
			}
	}

}
