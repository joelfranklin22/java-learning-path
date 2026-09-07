class Perfect_Numbers {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPerfect(n));
    }

    static boolean isPerfect(int n) {
        if (n == 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int pair = n / i;
                if (pair != i)
                    sum += pair;
            }
        }
        return n == sum;
    }
}
