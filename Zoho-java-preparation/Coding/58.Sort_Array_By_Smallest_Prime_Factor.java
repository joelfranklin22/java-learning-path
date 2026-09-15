import java.util.*;

class Sort_Array_By_Smallest_Prime_Factor {
    public static void main(String[] args) {
        int arr[] = { 15, 10, 21, 14, 9 };
        System.out.println(Prime_Factor(arr));
    }

    static ArrayList<Integer> Prime_Factor(int arr[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int prime = findPrime(arr[i]);
            l1.add(prime);
        }
        return sorted_order(l1, arr);
    }

    static int findPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return i;
        }
        return num;
    }

    static ArrayList<Integer> sorted_order(ArrayList<Integer> l1, int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(l1);
        for (int i = 0; i < l1.size(); i++) {
            int factor = l1.get(i);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != -1 && arr[j] % factor == 0) {
                    result.add(arr[j]);
                    arr[j] = -1;

                    break;
                }
            }
        }
        return result;
    }
}
