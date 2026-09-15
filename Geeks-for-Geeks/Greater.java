import java.util.*;

class Sol {
    public ArrayList<Integer> nextLargerElement(int[] a) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int len = a.length;
int j;
        for (int i = 0; i < len; i++) {
           // boolean found = false;

            for ( j = i + 1; j < len; j++) {
                if (a[j] > a[i]) {
                    l1.add(a[j]); // Add value, not index
                    //found = true;
                    break;
                }
            }

            if (len==j) {
                l1.add(-1);
            }
        }

        return l1;
    }
}

class Greater {
    public static void main(String args[]) {
        Sol s = new Sol();
        int arr[] = {1, 3, 2, 4};
        ArrayList<Integer> l1 = s.nextLargerElement(arr);
        System.out.println(l1);
    }
}
