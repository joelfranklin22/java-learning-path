import java.util.*;

class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -7, 5, 3 };
        System.out.print(findSubarray(arr));
    }

    static ArrayList<Integer> findSubarray(int[] arr) {

        long currentSum = 0;
        long maxSum = -1;

        int currentStart = 0;
        int bestStart = -1;
        int bestEnd = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                currentSum += arr[i];

                int currentLength = i - currentStart + 1;
                int bestLength = (bestStart == -1) ? 0 : bestEnd - bestStart + 1;

                if (currentSum > maxSum ||
                        (currentSum == maxSum && currentLength > bestLength)) {

                    maxSum = currentSum;
                    bestStart = currentStart;
                    bestEnd = i;
                }

            } else {
                currentSum = 0;
                currentStart = i + 1;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (bestStart == -1) {
            result.add(-1);
            return result;
        }

        for (int i = bestStart; i <= bestEnd; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}