class Solution {
    int majorityElement(int arr[]) {
        int candidate = -1;
        int count = 0;
        int len = arr.length;

        // Phase 1: Find a candidate
        for (int i = 0; i < len; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > len / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
class Majority {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a[] = {1, 2, 3, 1, 1, 1, 1};
        int ans = s.majorityElement(a);
        System.out.println("Majority Element: " + ans);
    }
}
