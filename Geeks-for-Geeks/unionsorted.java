import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> l1 = new ArrayList<>();	
        int len_a = a.length;
        int len_b = b.length;
        int i = 0, j = 0, z = 0;

        int c[] = new int[len_a + len_b];

        // Merge both arrays into one
        while (i < len_a || j < len_b) {
            if (i < len_a) {
                c[z++] = a[i++];
            }
            if (j < len_b) {
                c[z++] = b[j++];
            }
        }

        // Sort the merged array
        Arrays.sort(c);

        // Add the first element
        l1.add(c[0]);

        // Add only distinct elements
        for (int k = 1; k < c.length; k++) {
            if (c[k] != c[k - 1]) {
                l1.add(c[k]);
            }
        }

        return l1;
    }
}

class unionsorted {
    public static void main(String args[]) {
        Solution s4 = new Solution();
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};
        ArrayList<Integer> l1 = s4.findUnion(a, b);
        System.out.println("Union: " + l1);
    }
}
