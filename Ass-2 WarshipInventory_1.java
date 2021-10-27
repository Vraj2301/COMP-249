/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 2 Due Date 04/08/2021
 */

import java.io.*;
import java.util.Scanner;


public class WarshipInventory_1 {

	public static Warship_[] wsArr; // declaring a static array of warship

	/** 
	 * @param inputFileName
	 * @param outputFileName
	 * @throws IOException
	 */
	public static void fixInventory(Scanner inputFileName, PrintWriter outputFileName) throws IOException {

		for( int i = 0; i <= wsArr.length-1; i++) {
			wsArr[i] = new Warship_();



		}
	}

	/** This method displays the contents of the file 
	 * @param inputFile
	 * @throws IOException
	 */
	public static void displayFileContent(Scanner inputFile) throws IOException {

		while (inputFile.hasNextLine()) {

			String readline = inputFile.nextLine();
			Scanner sc = new Scanner(readline);
			while (sc.hasNext()) {
				System.out.print(sc.next() + " ");
			}
			System.out.println();
			System.out.println();
			sc.close();
		}
		inputFile.close();
	}

	/** Method for duplicating serial number 
	 * @param wsArr
	 * @throws IOException
	 */
	public static void duplicateSerialNumber (Warship_[] wsArr) throws IOException {

		Scanner num = new Scanner (System.in);
		int index = 0;
		for (int i = 0; i < wsArr.length; i++) {
			index = i++;

			while(index <wsArr.length) {
				if (wsArr[i].getSerialNum() == wsArr[index].getSerialNum()) {
					// need to call a method that changes the duplicate number 
					// ask user to enter new number and store its value.
				}
			}
		}
		num.close();
	}

	public static void main(String[] args)  {
		/**
		 * Prompt the user for the file name to generate
		 */
		System.out.print("Please enter the name of output file, which will have correct information: ");
		Scanner kb = new Scanner(System.in);
		String file_name = kb.nextLine(); // Takes the name of input file
		File file_Name = new File(file_name);
		/**
		 * Check whether file already exists or not
		 */
		while (file_Name.exists())
		{
			System.out.println("Error: There is an existing file called: " + file_Name);
			System.out.println("The file has a size of " + file_Name.length() + " bytes.");
			System.out.print("Please enter another file name to create:");
			file_name = kb.nextLine();
			file_Name = new File( file_name);
		}
		/**
		 * Declare Scanner and Printwriter variable to read and write file 
		 */
		Scanner inputFileName = null;
		PrintWriter outputFileName = null;
		System.out.println("Attempting to open " + file_Name);
		/**
		 * Using try block to avoid abnormal program ending
		 */
		try
		{ 
			inputFileName = new Scanner(new FileInputStream("Initial_Warship_Info.txt"));
			System.out.println("\nDetecting number of records in file Initial_WarShip_Info.txt");

			// getting the length of the array 

			int length = 34; // need to get the size of the inputFileName
			wsArr = new Warship_[length]; 

			/**
			 * checking if the length of the input array is 0 or 1 or more
			 * For length = 0 , 1 --> No correction + termination 
			 */
			if (length == 0 || length == 1)
			{
				System.out.println("It is an empty file. No correction needed. /nTerminating Program.");
				inputFileName.close();
				System.exit(0);
			} 
			/**
			 * For length > , fixInventoryMethod() is called
			 */
			else {
				System.out.println("The file has " + length + " records.");
				inputFileName.close();

				try {

					inputFileName = new Scanner(new FileInputStream("Initial_WarShip_Info.txt"));
					outputFileName = new PrintWriter(new FileOutputStream(file_Name));

					fixInventory(inputFileName, outputFileName);
					inputFileName.close();
					outputFileName.close();

				} 
				catch (FileNotFoundException e) {
					System.out.println("Problem with opening file " + file_Name + ". Terminating Program.");
					System.exit(0);
				}
				catch (IOException e) {
					System.out.println("Error during File reading. Terminating Program.");
					System.exit(0);
				}
				/**
				 * initializing Scanner and PrintWriter variables to copy content from one file to another
				 */
				Scanner inputfile = null ;
				PrintWriter outputfile = null;
				int count = 0;
				try {
					inputfile = new Scanner (new FileInputStream("Initial_WarShip_Info.txt"));
					outputfile = new PrintWriter (new FileOutputStream (file_Name));
					while(inputfile.hasNext())
					{
						String line = inputfile.nextLine();
						outputfile.write(line);
						outputfile.write("\n");
						count++;
					}
					System.out.println("File is copied");
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
				finally
				{
//					inputfile.close();
					outputfile.close();
				}

				/**
				 * Initializing another Scanner and PrintWriter variables to 
				 * save serial numbers in an array of type integer to use them in code later 
				 */
				Scanner inputfile2 = null ;
				PrintWriter outputfile2 ;
				try {
					inputfile2 = new Scanner (new FileInputStream("Initial_WarShip_Info.txt"));
					outputfile2 = new PrintWriter (new FileOutputStream (file_Name));
					int[] nb = new int[count];
					int[] newnb = new int[count];
					String[] useless = new String[count];
					for(int i =0;inputfile2.hasNext();i++)
					{
						String strnb = inputfile2.next();
						nb[i] = Integer.parseInt(strnb);
						useless[i] = inputfile2.nextLine();
					}
					for(int k = 0; k<nb.length; k++ )
						newnb[k] = nb[k]; 

					/**
					 * Again initializing Scanner variable to display duplicate serial numbers in txt file
					 * Prompt user to write correct serial number
					 */
					Scanner kb2 = new Scanner(System.in);
					int[] repeatnb = new int [count];
					for(int h = 0; h<nb.length; h++)
					{
						for(int c=h+1; c<nb.length;c++) {
							if(nb[c] == nb[h] && repeatnb[c]==0)
							{
								System.out.print("Duplicate serial number " + nb[c] + " detected in record # " +  (c+1) + ". Please enter the correct serial number: " );
								nb[c] = kb2.nextInt();
								repeatnb[c]= 1;
							}
						}
					}
					for(int h = 0; h<nb.length; h++)
					{
						for(int c=0; c<h;c++) {
							if(nb[c] == nb[h])
							{
								System.out.println( "Attempt of duplicate entry to a previous record.");
								System.out.println("Initial appearance of serial number " + nb[h] + " was found at record #: " + (h +1));
								System.out.println("Error..... Duplicate Entry of Serial Number. The entered serial number exists for another record.");
								System.out.print("Duplicate serial number " + newnb[c] + " detected in record # " + c + ". Please Enter the correct serial number: ");
								nb[c] = kb2.nextInt();
							}
						}
						for(int c=h+1; c<nb.length;c++) {
							if(nb[c] == nb[h])
							{
								System.out.println( "Attempt of duplicate entry to a previous record.");
								System.out.println("Initial appearance of serial number " + nb[h] + " was found at record #: " + (h+1));
								System.out.println("Error..... Duplicate Entry of Serial Number. The entered serial number exists for another record.");
								System.out.print("Duplicate serial number " + newnb[c] + " detected in record # " + (c + 1) + ". Please Enter the correct serial number: ");
								nb[c] = kb2.nextInt();
							}
						}

					}
					kb2.close();
					outputfile2.close();
					outputfile2 = new PrintWriter (new FileOutputStream (file_Name));
					for(int h = 0; h<nb.length; h++)
					{
						outputfile2.write(nb[h] + useless[h]);
						outputfile2.write("\n");
					}
					outputfile2.close();

				}
				catch(IOException e)
				{
					System.out.println(e);
				}
				// Displaying Original File content
				System.out.println("\nHere are the contents of file Initial_WarShip_Info.txt AFTER copying operation: ");
				System.out.println("=================================================================================");

				try {
					inputFileName = new Scanner(new FileInputStream("Initial_WarShip_Info.txt"));
					displayFileContent(inputFileName);
				} 
				catch (FileNotFoundException e) {
					System.out.println("Problem opening file. Hence, Terminating Program.");
					System.exit(0);
				}
				catch (IOException e) {
					System.out.println("Error reading file. Hence, Terminating program.");
					System.exit(0);
				}

				// Displaying contents of Corrected File
				System.out.println("Here are the contents of file " + file_Name + ": \n");
				System.out.println("=================================================================================");

				try {
					inputFileName = new Scanner(new FileInputStream(file_Name));
					displayFileContent(inputFileName);
					while(inputFileName.hasNextLine())
					{
						String Line= inputFileName.nextLine();

						System.out.println(Line);
					}
				} 
				catch (FileNotFoundException e) {
					System.out.println("Problem opening file " + file_Name + ". Terminating Program.");
					System.exit(0);
				} 
				catch (IOException e) {
					System.out.println("Error reading file " + file_Name + ". Terminating Program.");
					System.exit(0);
				}
			} 
		}
		catch (FileNotFoundException e) {
			System.out.println("Problem opening file. Hence, Terminating Program.");
			System.exit(0);
		} 
		kb.close( );
		inputFileName.close();
	}

}


