class Sum_Primes_Numbers_Reverse {

    public int sumPrimeBetween(int n) {

        int rev = reverse(n);

        int start = Math.min(n, rev);
        int end = Math.max(n, rev);

        int sum = 0;

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    // Reverse the number
    static int reverse(int n) {

        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return rev;
    }

    // Check prime
    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }
}