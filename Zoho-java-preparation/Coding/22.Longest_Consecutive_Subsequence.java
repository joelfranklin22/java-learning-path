import java.util.*;

class Longest_Consecutive_Subsequence {
    public static void main(String args[]) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        Arrays.sort(arr);
        int maxCount = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                count++;
            } else if (arr[i] == arr[i-1]) {
                continue;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count);
        System.out.println(maxCount);
    }
}
