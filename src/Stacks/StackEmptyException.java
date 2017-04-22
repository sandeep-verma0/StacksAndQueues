package Stacks;

public class StackEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4363892828813781600L;
	private String message = null;

	public StackEmptyException(String message) {

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
