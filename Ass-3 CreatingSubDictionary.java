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

	import java.util.ArrayList;
	import java.util.Scanner;
	import java.io.PrintWriter;
	import java.io.FileOutputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class CreatingSubDictionary {

		public static void main(String[] args) {

			// taking the user input for file name 
			Scanner keyInWord = new Scanner(System.in);

			// printing message for user to input 
			System.out.println("Hello! Welcome to the SubDictionary creator.");
			System.out.print("Enter the name of file you would like to open: ");
			// the entered value is stored in the userFileName
			String userFileName = keyInWord.next();


			// reading the file 
			Scanner inputFileName = null;
			// writing the file
			PrintWriter writeInFile = null;

			// Creating ArrayList to store the words
			ArrayList<String> stringList = new ArrayList<String>();
			int countWordInFile = 0; 

			// using a try and catch block to open a file and write on another file
			try {
				inputFileName = new Scanner(new FileInputStream(userFileName));
				writeInFile = new PrintWriter(new FileOutputStream("SubDictionary.txt"));
			} 
			catch(FileNotFoundException e) {
				System.out.println("\nThe file "+ userFileName + " can't be opened for reading. Recheck if the file exists.");
				System.out.println("The Program is terminated.");
				System.exit(0);
			}

			// reading the entire file and making necessary changes 
			while(inputFileName.hasNext()) {

				boolean addWordToFile = true;
				String nextWordInFile = inputFileName.next().toUpperCase();

				// checking if the word contains any numbers or digits from 0-9 and if it does
				// then do not add that word to the SubDictionary.
				char[] chars = nextWordInFile.toCharArray();
				for (char c: chars) {
					if(Character.isDigit(c)) {
						addWordToFile = false;
					}
				}

				//checking if the word is a character except A, I, a, i
				if(nextWordInFile.length() == 1) {
					if(!(nextWordInFile.contains("A")) || nextWordInFile.contains("I")  || nextWordInFile.contains("a") || nextWordInFile.contains("i")) {
						addWordToFile = false;
					}
				}


				// replacing the special characters of a string with nothing 
				// and storing the remaining word
				if(nextWordInFile.endsWith("?") || nextWordInFile.endsWith(":") || nextWordInFile.endsWith("'") ||
						nextWordInFile.endsWith(",") || nextWordInFile.endsWith("=") || nextWordInFile.endsWith(";")
						|| nextWordInFile.endsWith("!") || nextWordInFile.endsWith("."))
				{
					nextWordInFile=nextWordInFile.substring(0,(nextWordInFile.length()-1));

				}
				nextWordInFile=nextWordInFile.toUpperCase();

				// checking if the word ends in 'S, 's, 'M, 'm
				if(nextWordInFile.endsWith("'s")||nextWordInFile.endsWith("'m")||nextWordInFile.endsWith("'S")||nextWordInFile.endsWith("'M"))
				{
					nextWordInFile=nextWordInFile.substring(0,nextWordInFile.length()-2);
					nextWordInFile=nextWordInFile.toUpperCase();
				}

				// checking if the word is repeated or not and then add it 
				if(!(stringList.contains(nextWordInFile)) && addWordToFile == true) {
					
					// increases the count as it is a new non-repeated and a not stored word
					countWordInFile++; 
					
					//Adding the word in the given ArrayList
					stringList.add(nextWordInFile);
				}

			}

			writeInFile.write("The given file has " + countWordInFile + " entries.");
			writeInFile.write("\n");

			//Sorting the array list
			stringList.sort(null);

			// writing on the file 
			String Alphabet = stringList.get(0).substring(0, 1);
			writeInFile.write(Alphabet);
			writeInFile.write("\n");
			writeInFile.write("==");
			writeInFile.write("\n");

			for(int s = 0; s < stringList.size(); s++) 
			{
				String currentWord = stringList.get(s);
				// if the current word has the same initial alphabet as above 
				// then the word is written in the file
				if (currentWord.substring(0, 1).equalsIgnoreCase(Alphabet)) {
					writeInFile.write(currentWord);
					writeInFile.write("\n");
				}

				// if the current word has a different initial letter then
				// that alphabet and word is written accordingly
				else {
					Alphabet = currentWord.substring(0, 1);
					writeInFile.write("\n");
					writeInFile.write(Alphabet);
					writeInFile.write("\n");
					writeInFile.write("==");
					writeInFile.write("\n");
					writeInFile.write(currentWord);
					writeInFile.write("\n");
				}
			}

			// Printing final message and telling user that this is the end of the program
			System.out.println("The desired SubDictionary has been created.");
			System.out.println("The given file has " + countWordInFile + " entries.");
			System.out.println("The Program is terminated.");
			System.out.println("Thank you");

			// closing 
			keyInWord.close();
			writeInFile.close();
			inputFileName.close();
		}
	}


