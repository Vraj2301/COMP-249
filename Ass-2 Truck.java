/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */

public class Truck  extends Package
{
	// Declaring variables
	private String driver;
	private String destination;
	private String origin;
	private double grossweight = 0;
	private double unloadweight;
	private  int nbpackages;
	private String addinfo;
	private Package[] arraypack ;
	int nb = 0;

	/** Setter for driver 
	 * @param s type string
	 */
	public void setdriver(String s)
	{
		driver = s;
	}

	/** Setter for destination
	 * @param s string type
	 */
	public void setdestination(String s)
	{
		destination = s;
	}

	/** Setter for origin
	 * @param s string type
	 */
	public void setorigin(String s)
	{
		origin = s;
	}

	/** Setter for gross weight 
	 * @param d double type
	 */
	public void setgorssweight(double d)
	{
		grossweight = d;
	}

	/** Setter for load weight
	 * @param d double type
	 */
	public void setunloadweight(double d)
	{
		unloadweight = d;
	}

	/** Setter for adding info
	 * @param s string type
	 */
	public void setaddinfo(String s)
	{
		addinfo = s;
	}

	/** It is a method for setting array
	 * @param p
	 */
	public void setarraypack(Package[] p)
	{
		for (int i=0; i <p.length; i++)
		{
			arraypack[i] = p[i];
		}
	}

	/** Getter for driver
	 * @return string value
	 */
	public String getdriver()
	{
		return driver;
	}

	/** Getter for destination 
	 * @return string value
	 */
	public String getdestination()
	{
		return destination;
	}

	/** Getter for origin
	 * @return string value
	 */
	public String getorigin()
	{
		return origin;
	}

	/** Getter for gross weight
	 * @return double value
	 */
	public double getgrossweight()
	{
		return grossweight;
	}

	/** Getter for unloading weight
	 * @return double 
	 */
	public double getunloadweight()
	{
		return unloadweight;
	}

	/** Getter for adding Information
	 * @return
	 */
	public String getaddinfo()
	{
		return addinfo;
	}

	/** duplicating array
	 * @return
	 */
	public Package[] getarraypack()
	{
		Package[] duplicate = new Package[arraypack.length];
		for (int i=0; i <arraypack.length; i++)
		{
			duplicate[i] = (arraypack[i]); 
		}
		return duplicate;
	}

	/** Getter for number of packages
	 * @return
	 */
	public int getnbpackages()
	{
		return nbpackages;
	}

	public void load(Package p) throws PackageException, CloneNotSupportedException {
		if (p.gettrackingnb()%10 != 0 || p.gettrackingnb()%10!=1 || p.gettrackingnb()%10!=2 || p.gettrackingnb()%10!=3)
		{
			System.out.println("The package with tracking number " + p.gettrackingnb() + " is an unkown package and its weighht is " + p.getweight());
			throw new PackageException("This Package is not recoginzed.");
		}
		if (getweight()>p.maxweight)
		{
			System.out.println("The " + p.getClass() +" with tracking number " + p.gettrackingnb() + " is has a weight " + p.getweight() 
			+ " , which we are not able to load ,because it is more than the maximum weigth.");
			throw new PackageException ("This package has more weight");
		}
		if(arraypack.length > 200)
		{
			System.out.println("The " + p.getClass() +" with tracking number " + p.gettrackingnb() + " and has a weight " + p.getweight() 
			+ " , which we are not able to load becuase the truck is full.");
			throw new PackageException ("The truck is full");
		}
		else
		{
			arraypack[nb] = p.clone();
			nb++;
		}

	}
	public void unload(Package i) {
		System.out.println("We unload a " + i.getClass() +" with tracking number " + i.gettrackingnb() + " and has a weight " + i.getweight() + "lb." );
	}
	/** Method to change to kilograms
	 * @param d
	 * @return
	 */
	public double toKilograms(double d)
	{
		return d/2.2046226;
	}
	/**
	 * Method to change to pounds
	 */
	public double toPounds(double d)
	{
		return d*2.2046226;
	}
	/**
	 * Method to unload weight
	 */
	public void unloadweight() {
		System.out.println("The weigth of truck in pound is "+ this.getunloadweight() + " and in kilogram is " + this.toKilograms(getunloadweight()));
	}
	public void grossweight() {
		for (int i = 0; i<arraypack.length; i++)
		{
			grossweight = unloadweight + arraypack[i].getweight();
		}
		System.out.println("The weigth of truck in pound is "+ grossweight + " and in kilogram is " + this.toKilograms(grossweight));
	}
}