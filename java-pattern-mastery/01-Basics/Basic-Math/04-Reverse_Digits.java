class Reverse_Digits {
    public static void main(String[] args) {
        int num = 003;
        System.out.println(reverse(num));
    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
