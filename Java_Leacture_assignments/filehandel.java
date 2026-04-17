// designe java programm that collect name age address like this persolanal information 
//then read file and check vowel and count wit for loop how many vowel in file and print it

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandel {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine(); // Consume the newline character
		System.out.print("Enter your address: ");
		String address = sc.nextLine();

        try{
            FileWriter fw = new FileWriter("personal_info.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Address: " + address + "\n");
            fw.close();
            System.out.println("Information saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();

        }
        // Now read the file and count vowels
        try {
            Scanner fileScanner = new Scanner(new java.io.File("personal_info.txt"));
            int vowelCount = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                for (char c : line.toCharArray()) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelCount++;
                    }
                }
            }
            fileScanner.close();
            System.out.println("Total number of vowels in the file: " + vowelCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        

}

}