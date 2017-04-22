package Queues;

public class ArrayQueue<E> implements Queue<E> {

	private final static int CAPACITY = 1000;
	private int size = 0;
	private int front=0;
	private int rear=0;
	protected E queue[];

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		queue = (E[]) new Object[capacity];
	}

	public ArrayQueue() {
		this(CAPACITY);
	}

	@Override
	public void enqueue(E e) throws CapacityReachedException {
		if (size != queue.length)
			{
			queue[size++] = e;
			rear++;
			}
		else
			throw new CapacityReachedException("Capacity cannot be increased.");

	}

	@Override
	public E dequeue() throws QueueEmptyException {
		E temp;
		if (isEmpty())
			throw new QueueEmptyException("No element present in stack.");
		else {
			temp = queue[front];
			queue[front] = null;
			front++;
		}
		return temp;
	}

	@Override
	public int size() {
		return (rear-front) ;
	}

	@Override
	public E front() throws QueueEmptyException {
		return queue[front];
	}

	@Override
	public boolean isEmpty() {
		return (front==rear);
	}

}
