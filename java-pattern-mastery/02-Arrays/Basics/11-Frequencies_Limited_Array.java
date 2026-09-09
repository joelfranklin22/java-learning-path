import java.util.ArrayList;
import java.util.HashMap;

class Frequencies_Limited_Array {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 2, 3, 5 };
        System.out.println(frequencyCount(arr));
    }

    static ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer, Integer> m1 = new HashMap<>();
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            m1.put(arr[i], m1.getOrDefault(arr[i], 0) + 1);
        }
        for (int j = 1; j <= arr.length; j++) {
            if (m1.containsKey(j))
                l1.add(m1.get(j));
            else
                l1.add(0);
        }
        return l1;
    }
}