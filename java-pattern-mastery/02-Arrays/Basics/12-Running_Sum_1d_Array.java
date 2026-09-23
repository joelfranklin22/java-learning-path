class Running_Sum_1d {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(runningSum(nums));
    }

    static int[] runningSum(int[] nums) {

        int temp[] = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            temp[i] = sum;
        }
        return temp;
    }
}
