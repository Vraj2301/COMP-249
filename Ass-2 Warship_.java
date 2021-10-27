/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 2 Due Date 04/08/2021
 */

public class Warship_{

	// Class attributes
	private long SerialNum;
	private String Name;
	private int CreationYear;
	private String OwnerCountry;
	private double Price;
	private int Speed;

	// The Accessors and Mutator methods for the above mentioned attributes

	/**
	 * It is a getter/accessor that gets the value of serial number
	 * 
	 * @return SerialNum which is long type
	 */
	public long getSerialNum() {
		return SerialNum;
	}

	/**
	 * It is a setter/mutator method that takes long value as a parameter
	 * 
	 * @param SerialNum
	 */
	public void setSerialNum(long SerialNum) {
		this.SerialNum = SerialNum;
	}

	/**
	 * Getter to getName
	 * 
	 * @return Name of string type
	 */
	public String getName() {
		return Name;
	}

	/**
	 * Setter of name and takes string as parameter
	 * 
	 * @param Name
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * Getter for Creation Year
	 * 
	 * @return CreationYear
	 */
	public int getCreationYear() {
		return CreationYear;
	}

	/**
	 * Setter for creation year and takes int value as parameter
	 * 
	 * @param CreationYear
	 */
	public void setName(int CreationYear) {
		this.CreationYear = CreationYear;
	}

	/**
	 * Getter for the name of owner country
	 * 
	 * @return OwnerCountry
	 */
	public String getOwnerCountry() {
		return OwnerCountry;
	}

	/**
	 * Setter for owner country and takes string as parameter
	 * 
	 * @param OwnerCountry
	 */
	public void setOwnerCountry(String OwnerCountry) {
		this.OwnerCountry = OwnerCountry;
	}

	/**
	 * Getter for the Price
	 * 
	 * @return Price
	 */
	public double getPrice() {
		return Price;
	}

	/**
	 * Setter for price and takes double as parameter
	 * 
	 * @param Price
	 */
	public void setPrice(double Price) {
		this.Price = Price;
	}

	/**
	 * Getter for speed
	 * 
	 * @return Speed
	 */
	public int getSpeed() {
		return Speed;
	}

	/**
	 * Setter for speed and takes int as parameter
	 * 
	 * @param Speed
	 */
	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}

	/**
	 * It is a default constructor that initializes all the attributes
	 */
	public Warship_() {
		this.SerialNum = 0;
		this.Name = "";
		this.CreationYear = 0;
		this.OwnerCountry = "";
		this.Price = 0.0;
		this.Speed = 0;
	}

	/**
	 * This constructor takes in values of six parameters of different types
	 * @param SerialNum takes long type
	 * @param Name takes String type
	 * @param CreationYear takes int type
	 * @param OwnerCountry takes String type
	 * @param Price takes double type
	 * @param Speed takes int type
	 */
	public Warship_(long SerialNum, String Name, int CreationYear, String OwnerCountry, double Price, int Speed) {
		this.SerialNum =SerialNum;
		this.Name = Name;
		this.CreationYear = CreationYear;
		this.OwnerCountry = OwnerCountry;
		this.Price = Price;
		this.Speed = Speed;
	}

	/**
	 * This is a copy constructor of Warship
	 * @param obj
	 */
	public Warship_(Warship_ obj) {
		this.SerialNum = obj.SerialNum;
		this.Name = obj.Name;
		this.CreationYear = obj.CreationYear;
		this.OwnerCountry = obj.OwnerCountry;
		this.Price = obj.Price;
		this.Speed = obj.Speed;
	}

	/**
	 * This is an overridden equals method that tests if the object is null or not from the same class.
	 * Then its tests if the Warship is equal to the new Warship obj created by testing each value.
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			Warship_ NewObj = (Warship_) obj;
			return this.SerialNum == NewObj.SerialNum && this.Name.equals(NewObj.Name) && 
					this.CreationYear == NewObj.CreationYear && this.OwnerCountry.equals(NewObj.OwnerCountry) &&
					this.Price == NewObj.Price && this.Speed == NewObj.Speed;
		} else
			return false;
	}

	/**
	 * This is an Overridden toString method to print required output.
	 */
	public String toString() {
		return "abc";
	}

	public static void main(String[] args) {

	}

}
