
import java.util.Arrays;

class Two_Sum_II_Input_Array_Sorted {

    public static void main(String[] args) {

        int nums[] = {2, 7, 9, 11, 15};
        int target = 20;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }
}
