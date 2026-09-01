import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int c[]=new int[len1+len2];
        int len3=c.length;
        for(int i=0;i<len1;i++)
            c[i]=nums1[i];
        for(int i=0;i<len2;i++)
            c[len1+i]=nums2[i];
        Arrays.sort(c);
        int mid=len3/2;
        if(mid%2==0)
            return (double)(c[mid]+c[mid-1])/2;
        else
              return c[mid];          
    }
}

class Median_Sorted {
    public static void main(String args[]) {
        Solution s = new Solution();
        int a[] = { };
        int b[] = { 2 };
        double ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);
    }
}

