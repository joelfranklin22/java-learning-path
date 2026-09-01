import java.util.*;

class Sort_Elements_Decreasing_Frequency {
    public static void main(String args[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = { 9, 9, 9, 2, 4, 3 };
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> l1 = new ArrayList<>(map.entrySet());
        Collections.sort(l1, (a, b) -> {
            if (!a.getValue().equals(b.getValue()))
                return b.getValue() - a.getValue();
            return a.getKey() - b.getKey();
        });

        for (Map.Entry<Integer, Integer> entry : l1) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + "");
            }
        }
    }
}
