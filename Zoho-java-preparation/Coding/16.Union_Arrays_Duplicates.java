import java.util.*;

class Union_Arrays_Duplicates {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 2, 1, 9 };
        int b[] = { 3, 2, 2, 3, 3, 2 };
        Set<Integer> s1 = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            s1.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            s1.add(b[i]);
        }
        List<Integer> l1 = new ArrayList<>(s1);
        System.out.println(l1);
    }
}
