class Reverse_Vowels {
    public static void main(String args[]) {
        String str = "practice";
        char arr[] = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            char ch1 = arr[i];
            char ch2 = arr[j];
            if (!isVowel(ch1))
                i++;
            else if (!isVowel(ch2)) {
                j--;
            } else {
                // Both are vowels
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
    }

    static Boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

}
