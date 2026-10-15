
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Top_K_Frequent_Elements {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1, 2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
