package package3;

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059)
 * COMP 249
 * Assignment #1 
 * Due Date 18/07/2021
 * 
 * It is a child class of the PublicTransportation and is at second level of inheritance
 */

import package1.PublicTransportation;

public class Ferry extends PublicTransportation {

	/**
	 * It declares the parameter and its type as build year is int type and name of ship has string type
	 */
	protected int buildYear; // b
	protected String shipName; // sn

	// Default constructor and initializing the parameters
	public Ferry() {
		super();
		this.buildYear = 0;
		this.shipName = "";
//		System.out.println("I am Ferry constructor!");
	}

	/**
	 * It is a constructor with 4 parameters 
	 * @param t taken from class PublicTransportation - ticketPrice
	 * @param n taken form class PublicTransportation - numOfStops
	 * @param b has int value for the build year
	 * @param sn has string type for the name of ship
	 */
	public Ferry(double t, int n, int b, String sn) {
		super(t, n);
		this.buildYear = b;
		this.shipName = sn;
	}
	/** This is an int type getter
	 * @return the int value for build year
	 */
	public int getbuildYear() {
		return buildYear;
	}

	/** This is a setter method for build year
	 * @param b sets the given value to build year
	 */
	public void setbuildYear(int b) {
		this.buildYear = b;
	}

	/** It is a string type getter
	 * @return a string value for the name of ship 
	 */
	public String getshipName() {
		return shipName;
	}

	/** It is a setter method for name of ship
	 * @param sn sets the given string value to the parameter for the name of ship
	 */
	public void setship_name(String sn) {
		this.shipName = sn;
	}

	// --------------------------------
	public Ferry(Ferry obj) {
		super(obj);
		this.buildYear = obj.buildYear;
		this.shipName = obj.shipName;
	}
	/**
	 * This is an overriden equals method with public visibility same as the parent class- PublicTransportation.
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			Ferry newobj = (Ferry) obj;
			return this.ticketPrice == newobj.ticketPrice && this.numOfStops == newobj.numOfStops
					&& this.buildYear == newobj.buildYear && this.shipName == newobj.shipName;
		} else
			return false;
	}

	/**
	 * It generates a toString method who's output is formated in a way that is user
	 * readable. It is an overridden method.
	 */
	public String toString() {
		return "This Ferry's name is" + getshipName() + ", it has " + get_numOfStops() + " stops, and costs "
				+ get_ticketPrice() + "$. It was bulid in the year " + getbuildYear() + ".";
	}

}
