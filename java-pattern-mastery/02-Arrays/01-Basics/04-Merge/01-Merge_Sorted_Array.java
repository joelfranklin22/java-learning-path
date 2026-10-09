
class Merge_Sorted_Array {

    public static void main(String[] args) {

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3;
        int n = 3;

        int len = nums1.length - 1;
        m = m - 1;
        n = n - 1;

        while (m >= 0 && n >= 0) {
            if (nums1[m] < nums2[n]) {
                nums1[len] = nums2[n];
                len--;
                n--;
            } else {
                nums1[len] = nums1[m];
                nums1[m] = nums2[n];
                m--;
                len--;
            }
        }
        while (n >= 0) {
            nums1[len] = nums2[n];
            n--;
            len--;
        }

        for (int result : nums1) {
            System.out.println(result);
        }
    }
}
