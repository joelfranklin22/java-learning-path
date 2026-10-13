
import java.util.Arrays;

class Squares_Sorted_Array {

    public static void main(String[] args) {

        int nums[] = {-4, -1, 1, 2, -2, -4, 9};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    static int[] sortedSquares(int[] nums) {

        // Method-1 this method used just time + space ->O(n) + O(n)
        int i = 0;
        int j = nums.length - 1;
        int result[] = new int[nums.length];
        int index = nums.length - 1;

        while (i <= j) {
            int leftValue = nums[i] * nums[i];
            int rightValue = nums[j] * nums[j];

            if (leftValue > rightValue) {
                result[index] = leftValue;
                i++;
            } else {
                result[index] = rightValue;
                j--;
            }
            index--;
        }

        // Method-2 we can use this but time+Space complexity is O(n log n)
        for (int m = 0; m < nums.length; m++) {
            nums[m] = nums[m] * nums[m];
        }
        Arrays.sort(nums);
        return result;
    }
}
