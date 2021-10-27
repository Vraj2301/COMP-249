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
import java.util.Scanner;
public class CellPhone {
	private long serialNum;
	private String brand;
	private int year;
	private double price;

	/**
	 * getters and setters
	 * @param i
	 */
	public void setserialNum(long i) {
		serialNum = i;
	}

	public long getserialNum() {
		return serialNum;
	}

	public void setbrand(String i) {
		brand = i;
	}

	public String getbrand() {
		return brand;
	}

	public void setyear(int i) {
		year = i;
	}

	public int getyear() {
		return year;
	}

	public void setprice(double i) {
		price = i;
	}

	public double getprice() {
		return price;
	}


	/**
	 * Parameterize Constructor
	 * @param i
	 * @param s
	 * @param t
	 * @param d
	 */
	public CellPhone(long i , String s, int t, double d) {
		serialNum = i;
		brand = s;
		year = t;
		price =d;
	}

	/**
	 * Copy Constructor
	 * @param c
	 * @param l
	 */
	public CellPhone(CellPhone c , long l) {
		c.brand = brand;
		c.price = price;
		c.year = year;
		this.serialNum = l;
	}


	/**
	 *clone() method
	 */
	public CellPhone clone()  throws CloneNotSupportedException{
		CellPhone p = this.clone();
		Scanner keyIn = new Scanner(System.in);
		System.out.print("Please Enter unique Serial Number: ");
		long l = keyIn.nextLong();
		p.serialNum = l;
		keyIn.close();
		return p;
	}

	/**
	 *toString method
	 */
	public String toString() {
		return getserialNum() + " "+ getbrand() + " " + getprice() + "$ " + getyear();
	}

	/**
	 * equals method
	 */
	public boolean equals(Object p) {
		if(p == null)
			return false;
		else if(getClass() != p.getClass())
			return false;
		else
		{
			CellPhone P = (CellPhone)p;
			return (this.brand==P.brand && this.price == P.price && this.year==P.year);
		}
	}
}
