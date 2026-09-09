import java.util.HashMap;

class Array_Subset {
    public static void main(String[] args) {
        int a[] = { 11, 7, 1, 13, 21, 3, 7, 3 };
        int b[] = { 11, 3, 7, 1, 7 };
        System.out.print(isSubset(a, b));
    }

    static boolean isSubset(int a[], int b[]) {
        // code here

        HashMap<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < a.length; i++)
            m1.put(a[i], m1.getOrDefault(a[i], 0) + 1);

        for (int j = 0; j < b.length; j++) {
            if (!m1.containsKey(b[j]))
                return false;

            m1.put(b[j], m1.get(b[j]) - 1);

            if (m1.get(b[j]) == 0)
                m1.remove(b[j]);
        }

        return true;

    }
}
