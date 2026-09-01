class Solution {
    public int searchRange(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length - 1;
         int mid;
        int index = -1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}

public class First_Last {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int first = s.searchRange(a, target, true);
        if (first == -1) {
            System.out.println("[-1, -1]");
        } else {
            int last = s.searchRange(a, target, false);
            System.out.println("Result: [" + first + ", " + last + "]");
        }
    }
}
