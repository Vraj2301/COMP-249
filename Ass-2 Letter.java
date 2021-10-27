/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */

public class Letter extends Package{

	/**
	 * Maximum weight is of int type
	 */
	protected final int maxweight = 2;
	/**
	 * Setter for shipping cost 
	 */
	public void setshippingcost() {
		shippingcost = getweight() * 0.05;
	}
	/**
	 * Getter for shipping cost
	 */
	public double getshippingcost() {
		return shippingcost;
	}

}
