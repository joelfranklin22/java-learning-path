
class pivot_index {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (right == left) {
                return i;
            }

            left += nums[i];

        }
        return -1;
    }
}
