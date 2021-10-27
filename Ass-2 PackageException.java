/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */
public class PackageException extends Exception{
	/* Constructor of custom exception class
	 * here I am copying the message that we are passing while
	 * throwing the exception to a string and then displaying
	 * that string along with the message.
	 */
	PackageException(String str) {
		super(str);
	}
	public String toString(){
		return ("We are not able to load this package in truck") ;
	}
}
