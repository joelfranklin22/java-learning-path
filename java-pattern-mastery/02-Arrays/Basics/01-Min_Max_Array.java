import java.util.ArrayList;
import java.util.Arrays;

class Min_Max_Array {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 1, 2, 9, 4 };
        System.out.println(arr);
    }

    static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> l1 = new ArrayList<>();
        Arrays.sort(arr);
        l1.add(arr[0]);
        l1.add(arr[arr.length - 1]);
        return l1;
    }
}