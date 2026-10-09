// Union of Arrays with Duplicates
// You are given two arrays a[] and b[], return the Union of both the arrays in any order.

// The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.

// Note: Elements of a[] and b[] are not necessarily distinct.
// Note that, You can return the Union in any order but the driver code will print the result in sorted order only.

// Examples:

// Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
// Output: [1, 2, 3]
// Explanation: Union set of both the arrays will be 1, 2 and 3.
// Input: a[] = [1, 2, 3], b[] = [4, 5, 6] 

import java.util.*;

class Union_Arrays_Duplicates {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 3, 4, 5, 6 };

        System.out.println(findUnion(a, b));
    }

    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> s1 = new HashSet<>();

        for (int i = 0; i < a.length; i++)
            s1.add(a[i]);

        for (int i = 0; i < b.length; i++)
            s1.add(b[i]);

        ArrayList<Integer> l1 = new ArrayList<>(s1);

        return l1;
    }
}
