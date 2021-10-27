package package2;

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059)
 * COMP 249
 * Assignment #1 
 * Due Date 18/07/2021
 * 
 * It is a child class of the CityBus and is at third level of inheritance
 */

public class Metro extends CityBus {

	/**
	 * It includes 2 parameters for the number of vehicles and the name of the city.
	 * The type of each parameter is declared as int for number of vehicles and string for the name of city
	 */
	int numOfVehicles; // v
	String nameOfCity; // c

	/**
	 * We create a default constructor for the class and initialize its parameters
	 */
	public Metro() {
		super();
		numOfVehicles = 0;
		nameOfCity = "";
//		System.out.println("I am a Metro constructor!");
	}
	
	/**
	 * It is a constructor that takes 8 parameters
	 * @param t taken from class PublicTransportation - ticketPrice
	 * @param n taken form class PublicTransportation - numOfStops
	 * @param r taken from class CityBus - routeNum
	 * @param o taken from class CityBus - OperationYear
	 * @param l taken from class CityBus - lineName
	 * @param d taken from class CityBus - driverName
	 * @param v is the value of number of vehicles
	 * @param c is the value of the name of city
	 */
	Metro(double t, int n, long r, int o, String l, String d, int v, String c) {
		super(t, n, r, o, l, d);
		this.numOfVehicles = v;
		this.nameOfCity = c;
	}

	/** This is an int type getter 
	 * @return the int value for number of vehicles
	 */
	public int getnumOfVehicles() {
		return numOfVehicles;
	}

	/** This is a setter method for number of vehicles 
	 * @param v sets the value of number of vehicles
	 */
	public void setnumOfVehicles(int v) {
		this.numOfVehicles = v;
	}

	/** This is a string type getter
	 * @return the given string value for name of city
	 */
	public String getnameOfCity() {
		return nameOfCity;
	}

	/** This is a setter  
	 * @param c sets the given value to name of city
	 */
	public void setnameOfCity(String c) {
		this.nameOfCity = c;
	}

	// -------------
	/**
	 * @param obj
	 */
	public Metro(Metro obj) {
		super(obj);
		this.numOfVehicles = obj.numOfVehicles;
		this.nameOfCity = obj.nameOfCity;
	}

	/**
	 * This is an overriden equals method with public visibility same as the parent class.
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			Metro newobj = (Metro) obj;
			return this.ticketPrice == newobj.ticketPrice && this.numOfStops == newobj.numOfStops
					&& this.routeNum == newobj.routeNum && this.OperationYear == newobj.OperationYear
					&& this.lineName == newobj.lineName && this.driverName == newobj.driverName
					&& this.numOfVehicles == newobj.numOfVehicles && this.nameOfCity == newobj.nameOfCity;
		} 
		else
			return false;
	}

	/**
	 * It generates a toString method who's output is formated in a way that is user
	 * readable. It is an overriden method.
	 */
	public String toString() {
		return "This Metro has " + get_numOfStops() + " stops, and costs " + get_ticketPrice()
				+ "$. The route number is " + getrouteNum() + ". The begining operation year of metro is "
				+ getOperationYear() + ". Its line name is " + getlineName() + " and its driver is "
				+ getdriverName() + "There are " + getnumOfVehicles() + " vehicles in the city of " + getnameOfCity() + ".";
	}

}
