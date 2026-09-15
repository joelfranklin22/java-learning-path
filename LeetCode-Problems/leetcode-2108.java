//  Find First Palindromic String in the Array
class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (palindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    static boolean palindrome(String s1) {

        int i = 0;
        int j = s1.length() - 1;
        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }   

}
