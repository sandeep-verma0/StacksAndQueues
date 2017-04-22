package QuestionsStackAndQueues;

public class CapacityReachedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2306217314057753846L;
	private String message = null;

	public CapacityReachedException(String message) {

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

