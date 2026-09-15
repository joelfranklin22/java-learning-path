class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int max_count = 0;
        int zeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeros++;
            while (zeros > k) {
                if (nums[left] == 0)
                    zeros--;
                left++;
            }
            max_count = Math.max(max_count, right - left + 1);
        }
        return max_count;
    }
}