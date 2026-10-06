
class Running_Sum_1d_Array {

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(runningSum(nums));
    }

    static public int[] runningSum(int[] nums) {

        int temp[] = new int[nums.length];
        temp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            temp[i] = nums[i] + temp[i - 1];
        }
        return temp;
    }
}
