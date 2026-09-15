import java.util.*;

class Smallest_Greater_Whole_Array {
    public static void main(String args[]) {

        ArrayList<Integer> l1 = new ArrayList<>();

        int arr[] = { 6, 3, 9, 8, 10, 2, 1, 15, 7 };

        int sorted[] = arr.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int num = Search(sorted, value);
            l1.add(num);
        }
        System.out.print(l1);
    }

    static int Search(int[] sorted, int n) {

        int start = 0;
        int end = sorted.length - 1;
        int answer = -100000;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (sorted[mid] > n) {
                answer = sorted[mid];
                end = mid - 1;
            } 
            else {
                start = mid + 1;

            }

        }
        return answer;
    }
}
