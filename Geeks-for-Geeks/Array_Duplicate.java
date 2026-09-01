import java.util.*;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                l1.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }

        return l1;
    }
}

class Array_Duplicate {
    public static void main(String args[]) {
        Solution s1 = new Solution();
        int a[] = {1, 2, 3, 2, 1};
        ArrayList<Integer> l1 = s1.findDuplicates(a);
        Collections.sort(l1);
        System.out.println(l1); 
    }
}
