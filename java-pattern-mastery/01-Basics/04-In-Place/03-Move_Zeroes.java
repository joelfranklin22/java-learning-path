
class Move_Zeroes {

    public static void main(String args[]) {
        int nums[] = {0, 0, 2, 4, 1, 1, 0, 0, 1, 1, 1};
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
        for (int ans : nums) {
            System.out.println(ans);
        }
    }
}
