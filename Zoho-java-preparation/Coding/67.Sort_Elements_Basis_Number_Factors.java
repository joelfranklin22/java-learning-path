import java.util.ArrayList;
import java.util.Arrays;

 class Sort_Elements_Basis_Number_Factors {
    public static void main(String[] args) {
        int arr[] = { 5, 11, 10, 20, 9, 16, 23 };
        System.out.print(Arrays.toString(Numbers(arr)));
    }

    static int[] Numbers(int arr[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            l1.add(factor(arr[i]));
        }
        return sortFactors(l1, arr);
    }

    static int factor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    static int[] sortFactors(ArrayList<Integer> l1, int arr[]) {

        for (int i = 1; i < l1.size(); i++) {

            int keyFactor = l1.get(i);
            int keyValue = arr[i];

            int j = i - 1;

            while (j >= 0 && l1.get(j) < keyFactor) {

                // Move factor
                l1.set(j + 1, l1.get(j));

                // Move original array value
                arr[j + 1] = arr[j];

                j--;
            }

            // Put both in same position
            l1.set(j + 1, keyFactor);
            arr[j + 1] = keyValue;
        }

        return arr;
    }

}
