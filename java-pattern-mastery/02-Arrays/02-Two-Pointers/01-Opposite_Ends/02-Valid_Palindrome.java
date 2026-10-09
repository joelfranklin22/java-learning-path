
class Valid_Palindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {

        int i = 0;
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();

        while (i < s.length()) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z')
                    || (ch >= '0' && ch <= '9')) {
                result.append(ch);
            }
            i++;
        }

        int k = 0;
        int j = result.length() - 1;

        while (k < j) {
            if (result.charAt(k) != result.charAt(j)) {
                return false;
            }
            k++;
            j--;
        }

        return true;
    }
}
