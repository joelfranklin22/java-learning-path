import java.util.*;

class Single_Element_Sorted_Array {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        // Another Method to Solve
        int ans = 0;
        for (int num : arr)
            ans ^= num;
        System.out.println("Xor Method --->" + ans);

        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m1.put(arr[i], m1.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : m1.keySet()) {
            if (m1.get(key) == 1) {
                System.out.println("HashMap Method --->" + key);
            }
        }
    }
}
