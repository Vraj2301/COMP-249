/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */

abstract class Package {

	// Declaring variables
	private int trackingnb;
	private double weight;
	protected double shippingcost;
	protected int maxweight;

	/** Getter for shipping cost
	 * @return double value for shipping cost
	 */
	public double getshippingcost() {
		return shippingcost;
	}

	/** Getter for weight
	 * @return double value for weight
	 */
	public double getweight() {
		return weight;
	}

	/** Getter for tracking number
	 * @return int value for same
	 */
	public int gettrackingnb() {
		return trackingnb;
	}

	/** Setter for weight
	 * @param b 
	 */
	public void setweight(double b) {
		weight = b;
	}

	/** Setter for tracking number
	 * @param b
	 */
	public void settrackingnb(int b) {
		trackingnb = b;
	}

	/** Depending on the case the value of tracking number it changes  its case 
	 * @return string value according to case
	 */
	public String typepack()
	{
		int t = gettrackingnb();
		switch(t%10)
		{
		case 0: return "letter";
		case 1: return "box";
		case 2: return "woodencrate";
		case 3: return "metal crate";
		default: return "The tracking number is not write";
		}
	}

	//	public String load() {
	//		return "";
	//	}

	/**
	 * Clone method for the package
	 */
	public Package clone() throws CloneNotSupportedException{
		return (Package)super.clone();
	}

	/** This is a method to change weight to ounces
	 * @param d
	 * @return value as double for ounces
	 */
	public double toOunces(double d)
	{
		return d/0.062499;
	}
	/** This is a method to change weight to pounds
	 * @param d
	 * @return double value for pounds
	 */
	public double toPounds(double d)
	{
		return d*0.062499;
	}
}
