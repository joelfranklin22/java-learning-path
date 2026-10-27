
import java.util.HashMap;

class Contiguous_Array {

    public static void main(String[] args) {

        int nums[] = {0, 1, 1, 1, 1, 1, 0, 0,};

        System.out.println(findMaxLength(nums));
    }

    static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int count = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);

            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
}
