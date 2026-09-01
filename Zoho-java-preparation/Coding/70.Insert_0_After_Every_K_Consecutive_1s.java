import java.util.*;

class Insert_0_After_Every_K_Consecutive_1s {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, };
        int k = 2;
        System.out.println(insertZero(arr, k));
    }

    static ArrayList<Integer> insertZero(int arr[], int k) {

        ArrayList<Integer> l1 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            l1.add(arr[i]);

            if (arr[i] == 1) {
                count++;
                if (count == k) {
                    l1.add(0);
                    count = 0;
                }
            } else
                count = 0;

        }
        return l1;
    }
}
