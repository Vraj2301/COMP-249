package package4;

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059)
 * COMP 249
 * Assignment #1 
 * Due Date 18/07/2021
 * 
 * It is a child class of the PublicTransportation and is at second level of inheritance
 */

import package1.PublicTransportation;




public class AirCraft extends PublicTransportation
{
 
    private ClassType classtype;
    private MaintenanceType Maintenancetype;
	enum ClassType {HELICOPTER, AIRLINE, GLIDER, BALLOON};
	enum MaintenanceType {WEEKLY, MONTHLY, YEARLY};
	
	/**
	 * It is a default constructor that calls the default constructor of its parent class.
	 */
	public AirCraft(){
		super();
		classtype = null;
		Maintenancetype = null;
//		System.out.println("I am Aircraft constructor!");
	}
	
	/** It is a constructor with 2 parameters
	 * @param t takes a double type for the attribute in the parent class Public Transportation
	 * @param n takes an int type for the attribute in parent class - Public Transportation
	 */
	public AirCraft (double t , int n, int ct , int mt) {
		super(t,n);
		ClassType[] ctype = ClassType.values();
		MaintenanceType[] mtype = MaintenanceType.values();
		classtype = ctype[ct];
		Maintenancetype = mtype[mt];
	}
	/**
	 * It generates a toString method who's output is formated in a way that is user
	 * readable. It is an overridden method.
	 */
	public String toString()
	{
		return "This AirCraft has " + get_numOfStops() + " stops, and its cost of ticket is " + get_ticketPrice() + "$." 
				+ "The type of AirCraft is " + getClassType() 
		        + " ans the maintance is of type " + getMaintenanceType() + ".";
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			AirCraft newobj = (AirCraft) obj;
			return this.get_ticketPrice() == newobj.get_ticketPrice() && this.get_numOfStops() == newobj.get_numOfStops()
					&& this.getClassType() == newobj.getClassType() && this.getClassType() == newobj.getClassType();
		} else
			return false;
	}
	
	/** This is a getter method for the enumerated class
	 * @return the value of maintenance type
	 */
	public MaintenanceType getMaintenanceType() {

        return this.Maintenancetype;
       
	}
	/** This is a getter for class type
	 * @return the value for class type
	 */
	public ClassType getClassType() {

        return this.classtype;
	}
	/** It is a setter for maintenance type
	 * @param t allows the user to choose and set it to monthly, yearly or weekly
	 */
	public  void setMaintanceType(int t) {

		switch (t)
        {
            case 0:
                this.Maintenancetype = MaintenanceType.MONTHLY;
            case 1:
            	this.Maintenancetype = MaintenanceType.WEEKLY;
            default:
            	this.Maintenancetype = MaintenanceType.YEARLY;
        }
	}
	/** It is a setter method for class type
	 * @param c allows to choose and set amongst the types of class
	 */
	public void setClassType(int c) {

		 switch (c)
	        {
	            case 0:
	                this.classtype =  ClassType.HELICOPTER;
	            case 1:
	                this.classtype =  ClassType.AIRLINE;
	            case 2:
	            	this.classtype = ClassType.GLIDER;
	            default:
	            	this.classtype =  ClassType.BALLOON;
	        }
	}
	
}