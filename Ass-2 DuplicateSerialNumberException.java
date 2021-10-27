/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 2 Due Date 04/08/2021
 */

public class DuplicateSerialNumberException extends Exception{

	/**
	 * Default Constructor for the exception
	 */
	public DuplicateSerialNumberException() {
		super("Error: Duplicate serial number detected.");
	}

	/**
	 * Constructor taking string as a parameter and passes that errorMessage to super
	 * @param errorMessage
	 */
	public DuplicateSerialNumberException(String errorMessage) {
		super(errorMessage);
	}
}

