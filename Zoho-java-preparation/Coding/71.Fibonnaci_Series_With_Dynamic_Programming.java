class Fibonnaci_Series_With_Dynamic_Programming {
    public static void main(String args[]) {

        int fib = 20;
        int dp[] = new int[fib + 1];
        dp[0] = 0;
        dp[1] = 1;
        int count = 0;
        for (int i = 2; i <= fib; i++) {
            count++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int a : dp)
            System.out.println(a + "\t");
        System.out.println("count value" + count);
    }

    static int count = 0;

    static int fib(int n) {
        count++;
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        else
            return fib(n - 1) + fib(n - 2);
    }

    static void main() {
        int n = 5;
        System.out.println(fib(n) + "\t" + "count" + count);
    }
}