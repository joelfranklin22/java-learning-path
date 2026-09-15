import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;

        Map<Object, Integer> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (!Objects.equals(map.put(c, i), map.put(words[i], i))) {
                return false;
            }
        }

        return true;
    }
}