package package2;

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059)
 * COMP 249
 * Assignment #1 
 * Due Date 18/07/2021
 * 
 * It is a child class of the PublicTransportation and is at second level of inheritance
 */

import package1.PublicTransportation;

public class CityBus extends PublicTransportation {

//	 It includes 4 parameters for route number, begin operation year, the line
//	 name and driver's name. The type of each parameter is declared as int for
//	 number of vehicles and string for the name of city
//	 
	/**
	 * It takes the long value for the route number.
	 */
	protected long routeNum; // r
	/**
	 * It takes int value for the beginning year of the operation of transport.
	 */
	protected int OperationYear; // o
	/**
	 * It is a string type for the name of line.
	 */
	protected String lineName; // l
	/**
	 * It is a string type for the name of driver.
	 */
	protected String driverName; // d

	/**
	 * A default constructor is created and it initializes its parameters
	 */
	public CityBus() {
		super();
		routeNum = 0;
		OperationYear = 0;
		lineName = "";
		driverName = "";
//		System.out.println("I am City Bus constructor!");
	}

	/**
	 * It is a constructor with 6 parameters
	 * 
	 * @param t taken from class PublicTransportation - ticketPrice
	 * @param n taken form class PublicTransportation - numOfStops
	 * @param r has the long value of the route number
	 * @param o has the int value of operation year
	 * @param l has the string type for name of the line
	 * @param d has the string value for the driver's name
	 */

	CityBus(double t, int n, long r, int o, String l, String d) {
		super(t, n);
		this.routeNum = r;
		this.OperationYear = o;
		this.lineName = l;
		this.driverName = d;
	}

	/** This is a long type getter method for route number
	 * @return a long for the value of route number
	 */
	public long getrouteNum() {
		return routeNum;
	}

	/** It is a setter method for the route number 
	 * @param r sets the value for routeNum
	 */
	public void setrouteNum(long r) {
		this.routeNum = r;
	}

	/** The following is an int type getter 
	 * @return the int value for operation year
	 */
	public int getOperationYear() {
		return OperationYear;
	}

	/** It is a setter 
	 * @param o gives the value to operation year
	 */
	public void setOperationYear(int o) {
		this.OperationYear = o;
	}

	/** This is a string type getter
	 * @return the string value for line name
	 */
	public String getlineName() {
		return lineName;
	}

	/** It is a setter for line name
	 * @param l gives the value to line name
	 */
	public void setlineName(String l) {
		this.lineName = l;
	}

	/** It is a string type getter for driver's name
	 * @return the string value for driver name
	 */
	public String getdriverName() {
		return driverName;
	}

	/** It is a setter for the driver name 
	 * @param d sets the name of driver
	 */
	public void setdriverName(String d) {
		this.driverName = d;
	}

	// -------------------------
	public CityBus(CityBus obj) {
		super(obj);
		this.routeNum = obj.routeNum;
		this.OperationYear = obj.OperationYear;
		this.lineName = obj.lineName;
		this.driverName = obj.driverName;
	}

	/**
	 * This is an overriden equals method with public visibility to facilitate all its 
	 * child classes the ease to override it. It has a boolean type.
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			CityBus newobj = (CityBus) obj;
			return this.ticketPrice == newobj.ticketPrice && this.numOfStops == newobj.numOfStops
					&& this.routeNum == newobj.routeNum && this.OperationYear == newobj.OperationYear
					&& this.lineName == newobj.lineName && this.driverName == newobj.driverName;
		}

		else
			return false;
	}

	/**
	 * It generates a toString method who's output is formated in a way that is user
	 * readable. It is an overriden method. It is a public method soo that all the 
	 * inherited classes can override it.
	 */
	public String toString() {
		return "This CityBus has " + get_numOfStops() + " stops, and costs " + get_ticketPrice()
				+ "$. The route number is " + getrouteNum() + ". The begining operation year of the CityBus is "
				+ getOperationYear() + ". The name of the bus line is " + getlineName() + " and its driver is "
				+ getdriverName() + ".";
	}
}
