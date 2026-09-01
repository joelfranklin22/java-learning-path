import java.util.ArrayList;
import java.util.HashMap;

 class Frequencies_Limited_Array {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 2, 3, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> l1 = new ArrayList<>();

        // Numbers 1 to n
        for (int i = 1; i <= arr.length; i++) {
            l1.add(map.getOrDefault(i, 0));
        }

        System.out.println(l1);
    }
}