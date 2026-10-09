import java.util.ArrayList;
import java.util.Arrays;

class Rotate_array_K_Times {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        System.out.println(rotateArray(arr, k));
    }

    static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k %= arr.size();
        swap(arr, 0, arr.size() - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, arr.size() - 1);

        return arr;
    }

    static void swap(ArrayList<Integer> arr, int start, int end) {
        while (start <= end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}