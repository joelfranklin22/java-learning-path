import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        // Store banned words in HashSet
        Set<String> bannedSet = new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word);
        }

        // Convert to lowercase and replace punctuation with spaces
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Count word frequencies
        Map<String, Integer> map = new HashMap<>();

        String[] words = paragraph.split("\\s+");

        String answer = "";
        int maxCount = 0;

        for (String word : words) {

            if (!bannedSet.contains(word) && !word.isEmpty()) {

                map.put(word, map.getOrDefault(word, 0) + 1);

                if (map.get(word) > maxCount) {
                    maxCount = map.get(word);
                    answer = word;
                }
            }
        }

        return answer;
    }
}