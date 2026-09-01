class Twisted_PrimeNumber {

    public static void main(String[] args) {

        int num = 97;

        System.out.println(TwistedPrimeNumber(num));
    }

    static boolean TwistedPrimeNumber(int num) {

        // Original number should be prime
        if (!isPrime(num))
            return false;

        // Reverse the number
        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        // Reversed number should also be prime
        return isPrime(rev);
    }

    static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }
}