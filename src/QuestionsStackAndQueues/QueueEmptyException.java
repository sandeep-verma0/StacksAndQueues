package QuestionsStackAndQueues;

public class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4363892828813781600L;
	private String message = null;

	public QueueEmptyException(String message) {

		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
