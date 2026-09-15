import java.util.*;

class Top_Three_Repeated_Array {
    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> l1 = new ArrayList<>(map.entrySet());
        Collections.sort(l1, (a, b) -> {
            if (!a.getValue().equals(b.getValue()))
                return b.getValue() - a.getValue();
            return a.getKey() - b.getKey();
        });
        for (int i = 0; i < 3; i++) {

            System.out.print(l1.get(i).getKey() + " ");
        }
    }
}
