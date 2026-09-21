
class Two_Sorted_Array {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int b[] = {2, 4, 6, 8, 10};
        int k = 3;
        System.out.println(kthElement(a, b, k));
    }

    static int kthElement(int a[], int b[], int k) {

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {

                k--;

                if (k == 0) {
                    return a[i];
                }

                i++;
            } else {

                k--;

                if (k == 0) {
                    return b[j];
                }

                j++;
            }
        }

        while (i < a.length) {

            k--;

            if (k == 0) {
                return a[i];
            }

            i++;
        }

        while (j < b.length) {

            k--;

            if (k == 0) {
                return b[j];
            }

            j++;
        }

        return - 1;
    }
}
