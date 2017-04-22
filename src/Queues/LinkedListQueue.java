package Queues;

public class LinkedListQueue<E> implements Queue<E> {
	Node head, tail;

	public class Node {

		Node next;
		Node previous;
		E value;

		public Node(Node next, Node previous, E value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public Node getNext() {
			return this.next;
		}

		public Node getPrevious() {
			return this.previous;
		}

		public E getValue() {
			return this.value;
		}
	}

	int size = 0;
	Object stack;

	@Override
	public void enqueue(E e) {

		if (size == 0) {
			Node headtailNode = new Node(null, null, e);
			head = tail = headtailNode;
		} else {
			Node newNode = new Node(head, null, e);
			head.setPrevious(newNode);
			head = newNode;
		}
		size++;
	}

	@Override
	public E dequeue() throws QueueEmptyException {
		E temp;
		if(isEmpty())
			throw new QueueEmptyException("Stack is empty.");
		else{
			 temp = tail.getValue();
			 tail=tail.getPrevious();
			 size--;
		}
		return temp;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E front() throws QueueEmptyException {
		return head.value;
	}

	@Override
	public boolean isEmpty() {
		return (size <= 0);
	}

}
