import java.util.*;

class Removing_Character {
    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "cat";
        HashSet<Character> set = new HashSet<>();

        // Add all characters of str2
        for (char ch : str2.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();

        // Keep only characters not present in str2
        for (char ch : str1.toCharArray()) {
            if (!set.contains(ch)) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
