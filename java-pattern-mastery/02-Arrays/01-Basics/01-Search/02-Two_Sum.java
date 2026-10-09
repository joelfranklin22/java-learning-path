
import java.util.HashMap;

class Two_Sum {

    public static void main(String args[]) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
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

        // Method-2
        // int i = 0;
        // int j = nums.length-1;
        // int temp[] = new int[2];
        // Arrays.sort(nums);
        // while (i <= j) {
        //     int sum = nums[i] + nums[j];
        //     if (sum == target) {
        //         temp[0] = i;
        //         temp[1] = j;
        //         return temp;
        //     } else if (sum > target)
        //         j--;
        //     else
        //         i++;
        // }
        // return temp;
    }
}
