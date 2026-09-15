class Solution {
    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n <= 1 || n%2==0)
            return false;
            
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

class Prime {
    public static void main(String args[]) {
        Solution s7 = new Solution();
        int n = 25;
        boolean result = s7.isPrime(n);
        System.out.println(result);
    }
}

