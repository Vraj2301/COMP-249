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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CellListUtilization {
	public static void main(String[] args) {

		//Declaring two empty list
		CellList empty1 = new CellList();
		CellList empty2 = new CellList();
		CellPhone cp = new CellPhone(123456789,"Motorolo",2005, 1253.56);
		try {

			// reading from Cell_Info and assigning it to one of the list
			Scanner read = new Scanner(new FileInputStream("Cell_Info.txt"));
			long snum = read.nextLong();
			String line =  read.next();
			double pri = read.nextDouble();
			int ye = read.nextInt();
			empty1.addToStart(new CellPhone(snum,line,ye,pri));
			while(read.hasNext()) {
				line =  read.nextLine();
				snum = read.nextLong();
				line =  read.next();
				pri = read.nextDouble();
				ye = read.nextInt();
				empty1.addToStart(new CellPhone(snum,line,ye,pri));
			}

			// printing content of first list
			empty1.showContents();

			// prompt serial number from user and then searching serial number from list
			boolean repeat = true;
			Scanner KeyIn = new Scanner(System.in);
			do {
				System.out.println("Please enter any serial numbers to search from the list: ");
				long serial = KeyIn.nextLong();
				empty1.find(serial);
				System.out.print("Would you like to search more serial number (Y/N)?: ");
				char s = KeyIn.next().charAt(0);
				if(s=='Y' || s=='y')
					repeat = true;
				else 
					repeat = false;
			}while(repeat==true);

			// verify the equality of two lists
			if(empty1.equal(empty2)==false)
				System.out.println("Both list are not same.");
			else
				System.out.println("Both list are same.");

			System.out.print("Please enter serial number to verify whther the file contains that serial number or not: ");

			// verifying whether the list contains serial number enter by user or not
			long findnum = KeyIn.nextLong();
			if(empty1.contains(findnum))
			{
				System.out.println("Empty1 contains " +findnum + ".");
			}

			System.out.println("Empty1 list after replace method");

			// replacing anyone cellphone obj 
			empty1.replaceAtIndex(cp, 0);
			empty1.showContents();

			// closing scanner object
			KeyIn.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
			System.exit(0);
		}
		catch( NoSuchElementException e) {
			System.out.println(e);
			System.exit(0);
		}
	}
}
