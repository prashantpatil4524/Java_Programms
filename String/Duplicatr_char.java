// Find Duplicate Characters in a String

import java.util.HashSet;
import java.util.Set;

public class Duplicatr_char {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> duplicates = findDuplicateCharacters(str);
        System.out.println("Duplicate characters in the string: " + duplicates);
    }

    public static Set<Character> findDuplicateCharacters(String str) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        return duplicates;
    }
}