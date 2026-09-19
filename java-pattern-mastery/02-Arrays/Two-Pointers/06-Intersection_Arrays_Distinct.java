class Intersection_Arrays_Distinct {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 2, 4 };
        System.out.println(intersectSize(a, b));
    }

    static int intersectSize(int a[], int b[]) {
        // Your code here

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j])
                i++;
            else
                j++;
        }

        // HashMap<Integer, Integer>m1 = new HashMap<>();

        // for (int i = 0; i<a.length; i++)
        // m1.put(a[i], m1.getOrDefault(a[i], 0) + 1);

        // for (int i = 0; i<b.length; i++) {
        // if (m1.containsKey(b[i]))
        // count++;
        // }
        return count;
    }
}
