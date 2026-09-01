class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
           
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
class Remove_Duplicates {
    public static void main(String args[]) {
        Solution s = new Solution();
        int a[] = {0,0,1,1,1,2,2,3,3,4};
        int result = s.removeDuplicates(a);
        System.out.println("k = " + result);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < result; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
