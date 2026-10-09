
import java.util.HashSet;

class Contains_Duplicate {

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {

        // Method -1
        HashSet<Integer> s1 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!s1.add(nums[i])) {
                return true;
            }
        }
        return false;

        // Method-2
        // Arrays.sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1])
        //         return true;
        // }
        // return false;
    }
}
