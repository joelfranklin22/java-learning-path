
import java.util.Arrays;
import java.util.HashMap;

class Two_Sum {

    public static void main(String args[]) {

        int nums[] = {2, 7, 9, 12};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (m1.containsKey(sum)) {
                return new int[]{m1.get(sum), i};
            }
            m1.put(nums[i], i);
        }
        return new int[]{};

    }
}
