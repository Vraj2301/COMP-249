package package1;

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059)
 * COMP 249
 * Assignment #1 
 * Due Date 18/07/2021
 *
 * It is the class at the top of Inheritance.
 * It is the base class for all other classes namely CityBus, Ferry, Aircraft.
 * It includes 2 parameters i.e., ticketPrice, numOfStops.
 * There are three constructors:
 *  1. default constructor 
 *  2. constructor with 2 parameters
 *  3. constructor that stores the passed value
 * It includes getters and setters for each parameter
 * It includes an equals method for testing equality
 * It has toString method that outputs the desired prompt 
 */


public class PublicTransportation {

	/**
	 * It takes the double value for the price of ticket
	 */
	protected double ticketPrice; // t
	/**
	 * It takes the int value for the number of stops
	 */
	protected int numOfStops; // n

	/**
	 * Creating a default constructor for the class and initializing the parameters
	 */
	public PublicTransportation() {
//		System.out.println("I am Public Transportation constructor!");
		ticketPrice = 0.0;
		numOfStops = 0;
	}

	// taking the values of the two parameters
	/**
	 * It is a constructor with to two parameters
	 * 
	 * @param t used for the ticket Price of the Public Transport
	 * @param n used for number of stops that are in that Public Transport
	 */
	protected PublicTransportation(double t, int n) {
		this.ticketPrice = t;
		this.numOfStops = n;
	}

	/**
	 * It is a getter that gets the value of the parameter
	 * 
	 * @return the value of price of ticket
	 */
	public double get_ticketPrice() {
		return ticketPrice;
	}

	/**
	 * It is a setter to set the value of the parameter
	 * 
	 * @param t sets the passed value to ticketPrice
	 */
	public void set_ticketPrice(Double t) {
		this.ticketPrice = t;
	}

	/**
	 * @return the value for number of stops
	 */
	public int get_numOfStops() {
		return numOfStops;
	}

	/**
	 * @param n sets the value for the number of stops
	 */
	public void set_numOfStops(int n) {
		this.numOfStops = n;
	}

	/**
	 * This is a ----- constructor 
	 * @param obj
	 */
	public PublicTransportation(PublicTransportation obj) {
		this.ticketPrice = obj.ticketPrice;
		this.numOfStops = obj.numOfStops;
	}

	/**
	 * This is an overriden equals method with public visibility to facilitate all its 
	 * child classes the ease to override it. It has a boolean type.
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			PublicTransportation newobj = (PublicTransportation) obj;
			return this.ticketPrice == newobj.ticketPrice && this.numOfStops == newobj.numOfStops;
		} else
			return false;
	}

	/**
	 * It generates a toString method who's output is formated in a way that is user
	 * readable. It is an overriden method. Made such that all the inherited class can 
	 * override it.
	 */
	public String toString() {
		return "There are " + get_numOfStops() + " stops in this public commute, and the cost of ticket is "
				+ get_ticketPrice() + "$.";
	}
}
