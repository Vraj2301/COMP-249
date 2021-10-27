

/**
 * Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059)
 * COMP 249
 * Assignment #1 
 * Due Date 18/07/2021
 */
// import all the classes from package 1,2,3 and 4
import package1.PublicTransportation;
import package2.CityBus;
import package2.Metro;
import package2.Tram;
import package3.Ferry;
import package4.AirCraft;

public class Driver_program {

// Declare method copy_CityBuss as mentioned in Part2
	public static PublicTransportation[] copy_CityBuss(PublicTransportation[] any_array) {
		PublicTransportation[] new_array = new PublicTransportation[any_array.length];
		for (int i = 0; i < any_array.length; i++) {
			new_array[i] = any_array[i];
		}
		return new_array;
	}

// Start of the main method
	public static void main(String[] args) {
		
// Declare one object of each class and print them, to check the working of default constructors.
		PublicTransportation trans = new PublicTransportation(); 
		CityBus bus = new CityBus();
		Metro metro = new Metro();
		Tram tram = new Tram();
		Ferry ferry = new Ferry();
		AirCraft aircraft = new AirCraft();
		System.out.println("This is PublicTransportaion class " + trans);
		System.out.println("This is CityBus class " + bus);
		System.out.println("This is Metro class " + metro);
		System.out.println("This is Tram class " + tram);
		System.out.println("This is Ferry class " + ferry);
		System.out.println("This is AirCraft class " + aircraft);
		
		
// Check the working og the equals constructor
		System.out.println(tram.equals(tram));
		System.out.println(tram.equals(trans));
		System.out.println(tram.equals(bus));
		System.out.println(trans.equals(bus));

		
// Declare an array of type PublicTransportation with the length of 15 and declare the necessary objects of different classes 
		PublicTransportation[] an_array = new PublicTransportation[15];
		PublicTransportation trans1 = new PublicTransportation();
		CityBus bus1 = new CityBus();
		Metro metro1 = new Metro();
		Tram tram1 = new Tram();
		Ferry ferry1 = new Ferry();
		AirCraft aircraft1 = new AirCraft();
		PublicTransportation trans2 = new PublicTransportation();
		CityBus bus2 = new CityBus();
		Metro metro2 = new Metro();
		
// Filling up the array with different object declared above
		an_array[0] = trans;
		an_array[1] = metro;
		an_array[2] = tram;
		an_array[3] = bus;
		an_array[4] = ferry;
		an_array[5] = aircraft;
		an_array[6] = trans1;
		an_array[7] = metro1;
		an_array[8] = tram1;
		an_array[9] = bus1;
		an_array[10] = ferry1;
		an_array[11] = aircraft1;
		an_array[12] = bus2;
		an_array[13] = metro2;
		an_array[14] = trans2;
		
// to search for the cheap and expensive ticket
//--------------------------------------------------------------------------------------------
// declare the variable cheap and initialize it to the ticket price of the 0 index object. 
		double cheap = an_array[0].get_ticketPrice();
		
// declare the object of type PubicTransportation and initialize it to the 0 index object.
		PublicTransportation lowest_price = an_array[0];
		
// declare the variables to hold the index of the cheap and expensive tickets  
		int cheapindex_nb = 0;
		int expensiveindex_nb = 0;
		
// declare the variable cheap and initialize it to the ticket price of the 0 index object. 
		double expensive = an_array[0].get_ticketPrice();
		
// declare the object of type PubicTransportation and initialize it to the 0 index object.
		PublicTransportation higest_price = an_array[0];
		
// for loop to search for the cheapest ticket
		for (int i = 0; i < an_array.length; i++) {
			if (cheap > an_array[i].get_ticketPrice()) {
				cheap = an_array[i].get_ticketPrice();
				lowest_price = an_array[i];
				cheapindex_nb = i;
			}
			
//for loop to search for the expensive ticket
			if (expensive < an_array[i].get_ticketPrice()) {
				expensive = an_array[i].get_ticketPrice();
				higest_price = an_array[i];
				expensiveindex_nb = i;
			}
		}
//--------------------------------------------------------------------------------------------
		
// Display the information of the public transportation which has the cheap and expensive tickets
		System.out.println("The transportation which has the lowest ticket price: " + lowest_price
				+ " It is at the index " + cheapindex_nb + ".");
		System.out.println("The transportation which has the highest ticket price: " + higest_price
				+ " It is at the index " + expensiveindex_nb + ".");

//-------------------------------------------------------------------------------------------------------------------------------------------------

// to check the aircraft class methods
		AirCraft demo = new AirCraft() ;
		demo.setClassType(1);
		demo.setMaintanceType(1);
		System.out.println("this is an aircraft:" +  demo);
		
// Part 2

// Declare an array of type PublicTransportation with the length of 12 and declare the necessary objects of different classes 
		PublicTransportation[] an_array2 = new PublicTransportation[12];
		PublicTransportation trans3 = new PublicTransportation();
		CityBus bus3 = new CityBus();
		bus3.setOperationYear(2002);
		Metro metro3 = new Metro();
		Tram tram3 = new Tram();
		Ferry ferry3 = new Ferry();
		AirCraft aircraft3 = new AirCraft();
		PublicTransportation trans4 = new PublicTransportation();
		CityBus bus4 = new CityBus();
		Metro metro4 = new Metro();
		Tram tram4 = new Tram();
		Ferry ferry4 = new Ferry();
		AirCraft aircraft4 = new AirCraft();
		
// Filling up the array with different object declared above
		an_array2[0] = trans3;
		an_array2[1] = metro3;
		an_array2[2] = tram3;
		an_array2[3] = bus3;
		an_array2[4] = ferry3;
		an_array2[5] = aircraft3;
		an_array2[6] = trans4;
		an_array2[7] = metro4;
		an_array2[8] = tram4;
		an_array2[9] = bus4;
		an_array2[10] = ferry4;
		an_array2[11] = aircraft4;

// Make the copy of the array using the copy_CityBuss method and print them on screen
		PublicTransportation[] new_array = Driver_program.copy_CityBuss(an_array2);
		
		
		System.out.println("Copied array");
		for (int i = 0; i < new_array.length; i++)
			System.out.println(new_array[i]);
		
		
		System.out.println("Original Array");
		for (int i = 0; i < an_array2.length; i++)
			System.out.println(an_array2[i]);

// Display the message according to the instruction in part 2
		System.out.println(
				"\nNotice:  Whether or not the coping is correct. If not; you need to explain why it has not been successful or as you might expect. Additionally, if the copying is not correct, do NOT try to correct it. You rather need to comment explicitly on the reasons for such misbehavior.");
	}

}
