
class Pivot_Index {

    public static void main(String args[]) {
        int nums[] = {1, 6, 2, 3, 9, 0};
        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {
        int total = 0;
        int left = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {

            int right = total - nums[i] - left;

            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
