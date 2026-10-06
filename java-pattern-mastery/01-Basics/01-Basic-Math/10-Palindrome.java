class Palindrome {
    public static void main(String[] args) {
        int n = -100;
        System.out.println(findPalindrome(n));
    }

    static boolean findPalindrome(int n) {
        if (n < 0)
            n = -n;

        int original = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }
}
