import java.util.Arrays;

class Check_Equal_Arrays {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1, 4 };
        int b[] = { 1, 3, 2, 4 };

        System.out.println(checkEqual(a, b));
    }

    static boolean checkEqual(int[] a, int[] b) {
        // code here
        if (a.length != b.length)
            return false;
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (a[i] != b[j])
                return false;
            i++;
            j++;
        }
        return true;
    }
}
