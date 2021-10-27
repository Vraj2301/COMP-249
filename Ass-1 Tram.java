package package2;

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #1 Due Date 18/07/2021
 * 
 * It is a child class of the CityBus and is at third level of inheritance
 */

public class Tram extends CityBus {

	/**
	 * It has one new parameter for maximum speed and has the type int.
	 */
	protected int MaxSpeed; // s

	/**
	 * We create a default constructor for the class and initialize its parameters
	 */
	public Tram() {
		super();
		MaxSpeed = 0;
//		System.out.println("I am a tram constructor!");
	}

	/**
	 * It is a constructor with 7 parameters
	 * 
	 * @param t taken from class PublicTransportation - ticketPrice
	 * @param n taken form class PublicTransportation - numOfStops
	 * @param r taken from class CityBus - routeNum
	 * @param o taken from class CityBus - OperationYear
	 * @param l taken from class CityBus - lineName
	 * @param d taken from class CityBus - driverName
	 * @param s corresponds to int value of maximum speed
	 */
	public Tram(double t, int n, long r, int o, String l, String d, int s) {
		super(t, n, r, o, l, d);
		this.MaxSpeed = s;
	}

	/**
	 * It is the getter and setter method for the maximum speed
	 * @return the value for maximum speed
	 */
	public int getMaxSpeed() {
		return MaxSpeed;
	}

	public void setMaxSpeed(int s) {
		this.MaxSpeed = s;
	}

	// ----------------
	public Tram(Tram obj) {
		super(obj);
		this.MaxSpeed = obj.MaxSpeed;
	}
	/**
	 * This is an overriden equals method with public visibility same as the parent class.
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			Tram newobj = (Tram) obj;
			return this.ticketPrice == newobj.ticketPrice && this.numOfStops == newobj.numOfStops
					&& this.routeNum == newobj.routeNum && this.OperationYear == newobj.OperationYear
					&& this.lineName == newobj.lineName && this.driverName == newobj.driverName
					&& this.MaxSpeed == newobj.MaxSpeed;
		} else
			return false;
	}

	/**
	 * It generates a toString method who's output is formated in a way that is user
	 * readable. It is an overridden method.
	 */
	public String toString() {
		return "This Tram has " + get_numOfStops() + " stops, and costs " + get_ticketPrice()
				+ "$. Its maximum speed is " + getMaxSpeed() + "km/h and the route number is " + getrouteNum()
				+ ". The begining operation year of this tram is " + getOperationYear() + ". The line name is "
				+ getlineName() + " and its driver is " + getdriverName();
	}
}
