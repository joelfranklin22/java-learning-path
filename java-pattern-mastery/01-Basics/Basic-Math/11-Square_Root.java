class Square_Root {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(square(n));
    }

    static int square(int n) {
        int square = 0;
        for (int i = 1; i <= n; i++) {
            square = i * i;
            if (square == n) {
                return i;
            } else if (square > n) {
                return i - 1;
            }
        }
        return 1;
    }
}

// Using Binary Search
// int low = 1, high = n, ans = 1;
// while (low <= high) {
// int mid = low + (high - low) / 2;
// long sq = (long) mid * mid;
// if (sq == n) {
// return mid;
// } else if (sq < n) {
// ans = mid; // possible answer, try bigger
// low = mid + 1;
// } else {
// high = mid - 1;
// }
// }
