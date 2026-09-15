import java.util.Arrays;

class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);  // Ensure the array is sorted
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                // Found the gap, return the missing number
                return arr[i] + 1;
            }
        }

        // If no missing number in the middle, maybe it's at the end
        return arr[len - 1] + 1;
    }
}

class missing {
    public static void main(String args[]) {
        Solution s = new Solution();
        int arr[] = {1,6,4,5,2}; // No missing number
        int missing = s.missingNum(arr);
        System.out.println("Missing Num: " + missing); // Output: 6
    }
}
