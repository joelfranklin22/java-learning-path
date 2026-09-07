class GCD {
    public static void main(String[] args) {
        int a = 1071;
        int b = 462;
        System.out.println(gcd(a, b));
    }

    static int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
