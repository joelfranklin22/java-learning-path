
class Binary_Subarrays_With_Sum {

    public static void main(String[] args) {

        int nums[] = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(numSubarraysWithSum(nums, goal));
    }

    static int numSubarraysWithSum(int[] nums, int goal) {

        int answer = atMost(nums, goal) - atMost(nums, goal - 1);

        return answer;
    }

    static int atMost(int nums[], int limit) {

        int sum = 0;
        int left = 0;
        int count = 0;

        if (limit < 0) {
            return 0;
        }

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > limit) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
