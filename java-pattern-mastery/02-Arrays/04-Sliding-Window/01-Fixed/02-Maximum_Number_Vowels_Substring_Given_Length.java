
class Maximum_Number_Vowels_Substring_Given_Length {

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    static int maxVowels(String s, int k) {

        int max = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }

            if (right >= k - 1) {
                max = Math.max(max, count);
                char vowel = s.charAt(right - k + 1);
                if (vowel == 'a' || vowel == 'e' || vowel == 'i'
                        || vowel == 'o' || vowel == 'u') {
                    count--;
                }

            }

        }

        return max;
    }
}
