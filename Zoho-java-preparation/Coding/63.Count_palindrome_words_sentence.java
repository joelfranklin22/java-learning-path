class Count_palindrome_words_sentence {
    public static void main(String[] args) {

        String str = "Nitin speaks malayalam";

        String[] arr = str.split("\\s+");
        System.out.println(palindromeCount(arr));

    }

    static int palindromeCount(String arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (palindrome(arr[i].toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    static boolean palindrome(String s1) {

        System.out.println(s1);

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
