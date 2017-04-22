package Stacks;

public class ClientLinkedListStack {
	
	public static void main(String[] args) {

	   LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
	   
	   stack.push(10);
	   stack.push(20);
	   stack.push(30);
	   stack.push(40);
	   stack.push(50);
	   
	   try {
		System.out.println(stack.top());
	} catch (StackEmptyException e1) {
		e1.printStackTrace();
	}
	   int size = stack.size;
	   for(int i=0;i<size;i++){
		   try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
	   }
	}
}
