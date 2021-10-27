/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */

public class Box extends Package{
	/**
	 * Declaring maximum weight as a final which can't be modified
	 */
	protected final int maxweight = 40;
	/**
	 * Setter for shipping cost 
	 */
	public void setshippingcost() {
		shippingcost = getweight() * 2;
	}
	/**
	 * Getter for shipping cost 
	 */
	public double getshippingcost() {
		return shippingcost;
	}
}

