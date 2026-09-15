class Palindrome_Number {
    public static void main(String[] args) {
        int n = -121;
        if (n < 0)
            n = -n;
        int original = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum * 10 + digit;
            n /= 10;
        }
        if (original == sum)
            System.out.println("Palindrome_Number is 121");
        else
            System.out.println("Not Palindrome_Number");
    }
}
