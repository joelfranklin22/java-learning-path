class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (j < nums1.length && k < nums2.length) {
            if (nums1[j] < nums2[k]) {
                merge[i++] = nums1[j++];
            } else {
                merge[i++] = nums2[k++];
            }
        }
        while (j < nums1.length) {
            merge[i++] = nums1[j++];
        }

        while (k < nums2.length) {
            merge[i++] = nums2[k++];
        }

        int n = merge.length;

        if (n % 2 == 0) {
            return (merge[n / 2] + merge[n / 2 - 1]) / 2.0;
        } else {
            return merge[n / 2];
        }
    }
}