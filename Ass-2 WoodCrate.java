/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */

public class WoodCrate extends Package{
	protected final int maxweight = 80;
	/**
	 * setter for shippingcost
	 */
	public void setshippingcost() {
		shippingcost = getweight() * 2.5;
	}
	/**
	 * getter for shipping cost
	 */
	public double getshippingcost() {
		return shippingcost;
	}
}
