class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int maxLen = 0;
        int vowels = 0;
        for (int right = 0; right < s.length(); right++) {
            if ("aeiou".indexOf(s.charAt(right)) != -1)
                vowels++;
            if (right - left + 1 > k) {
                if ("aeiou".indexOf(s.charAt(left)) != -1)
                    vowels--;
                left++;
            }
            if (right - left + 1 == k)
                maxLen = Math.max(maxLen, vowels);
        }
        return maxLen;
    }
}