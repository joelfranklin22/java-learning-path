
import java.util.Arrays;

class Missing_Number {

    public static void main(String[] args) {

        int nums[] = {0, 2, 1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {

        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        // Method -2 calculating total sum of array and subtract with sum of the first n natural numbers formula.
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int n = nums.length;
        int expected = n * (n + 1) / 2;
        System.out.println(expected - total);
        // return expected - total;

        // Method -3 sorting and find the missing using equal operator
        Arrays.sort(nums);
        int i;

        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        System.out.println(i);
        // return i;
        return xor;

    }
}
