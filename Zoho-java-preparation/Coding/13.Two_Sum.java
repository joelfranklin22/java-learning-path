import java.util.*;

class Two_Sum {
    static boolean logic() {
        int arr[] = { 0, 0, -1, 2, -3, 1 };
        int target = -2;
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            if (m1.containsKey(sum))
                return true;
            m1.put(arr[i], i);
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.print(logic());

    }
}
