/**
 * Name(s) and ID(s): Gulnoor Kaur 40114998, Vraj Patel 40155059
 * COMP 249
 * Assignment #3
 * Part 1
 * Due Date: 19 August 2021
 * 
 * This is a basic SubDictionary creator program that uses ArrayList to store all 
 * the words in the dictionary and has numerous checks if the word contains any special characters 
 *  or numbers or is a single character. 
 */
public class NoSuchElementException extends Exception{
	/**
	 * Default exception
	 */
	NoSuchElementException() {
		super();
	}
	/**
	 *To String for Exception
	 */
	public String toString(){
		return ("The entered number is greater/less than size/0;") ;
	}
}
