
import java.util.Arrays;

class Partition_Array_According_Given_Pivot {

    public static void main(String[] args) {

        int nums[] = {3, 17, 91, 1, 3, 7, 8, 2, 41, 5, 9, 10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }

    static int[] pivotArray(int[] nums, int pivot) {

        int smallCount = 0;
        int equalCount = 0;

        for (int i : nums) {
            if (i < pivot) {
                smallCount++;
            } else if (i == pivot) {
                equalCount++;
            }
        }

        int small = 0;
        int equal = smallCount;
        int large = smallCount + equalCount;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[small++] = nums[i];
            } else if (nums[i] == pivot) {
                result[equal++] = nums[i];
            } else {
                result[large++] = nums[i];
            }
        }

        return result;
    }

}
