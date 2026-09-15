class Raise_Power_Own_Reverse {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(rev_power(num));
    }

    static int rev_power(int n) {
        int temp = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        return (int) Math.pow(temp, rev);
    }
}
