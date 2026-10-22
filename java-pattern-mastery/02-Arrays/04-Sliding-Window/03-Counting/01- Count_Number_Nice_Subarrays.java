
class Count_Number_Nice_Subarrays {

    public static void main(String[] args) {

        int nums[] = {1, 1, 2, 1, 1};
        int k = 3;

        System.out.println(numberOfSubarrays(nums, k));
    }

    static int numberOfSubarrays(int[] nums, int k) {

        int answer = atMost(nums, k) - atMost(nums, k - 1);
        return answer;
    }

    static int atMost(int nums[], int limit) {

        int left = 0;
        int count = 0;
        int oddCount = 0;

        if (limit < 0) {
            return 0;
        }

        for (int right = 0; right < nums.length; right++) {

            if ((nums[right] & 1) != 0) {
                oddCount++;
            }

            while (oddCount > limit) {
                if ((nums[left] & 1) != 0) {
                    oddCount--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
