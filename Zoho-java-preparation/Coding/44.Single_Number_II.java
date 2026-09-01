import java.util.HashMap;

class Single_Number_II {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 1, 0, 1, 99 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                System.out.println(num);
                break;
            }
        }
    }
}
