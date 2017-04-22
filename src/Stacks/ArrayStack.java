package Stacks;

public class ArrayStack<E> implements Stack<E> {

	private final static int CAPACITY = 1000;
	private int size = 0;
	protected E stack[];

	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		stack = (E[]) new Object[capacity];
	}

	public ArrayStack() {
		this(CAPACITY);
	}

	@Override
	public void push(E e) throws CapacityReachedException {
		if (size != stack.length)
			stack[size++] = e;
		else
			throw new CapacityReachedException("Capacity cannot be increased.");

	}

	@Override
	public E pop() throws StackEmptyException {
		E temp;
		if (isEmpty())
			throw new StackEmptyException("No element present in stack.");
		else {
			temp = stack[size-1];
			stack[size--] = null;
		}
		return temp;

	}

	@Override
	public int size() {
		return size ;
	}

	@Override
	public E top() throws StackEmptyException {
		return stack[size-1];
	}

	@Override
	public boolean isEmpty() {
		return (size < 1);
	}

}
