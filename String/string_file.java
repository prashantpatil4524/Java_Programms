// save strings 
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Map;
public class string_file{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();
        try {
            FileWriter writer = new FileWriter("lpu.txt");
            writer.write(str);
            writer.close();
            System.out.println("String saved to lpu.txt");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while saving the string.");
            e.printStackTrace();
        }
        try{
            FileReader reader = new FileReader("lpu.txt");
            int character;
            // define a map and strore frequency of each character in the map and print the frequency of each character in the string
            Map<Character, Integer> frequencyMap = new java.util.HashMap<>();
            while ((character = reader.read()) != -1) {
                char ch = (char) character;
                //vowal will be strored in the map and count of each vowal will be stored in the map
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                }
            }
            System.out.println("\nCharacter frequencies:");
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            reader.close();
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while reading the string.");
            e.printStackTrace();
        }
    }
}


