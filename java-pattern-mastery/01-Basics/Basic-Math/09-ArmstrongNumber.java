class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrong(n));
    }

    static boolean armstrong(int n) {
        int temp = n;
        int result = 0;
        int rev = 0;
        while (n != 0) {
            rev = n % 10;
            result += (rev * rev * rev);
            n /= 10;

        }
        return temp == result;
    }
}
