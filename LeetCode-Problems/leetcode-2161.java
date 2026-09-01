class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int items = 0;
        for (int num : nums) {
            if (num < pivot)
                ans[items++] = num;
        }
        for(int num:nums){
            if(num==pivot)
                ans[items++]=num;
        }
        for(int num:nums){
            if(num>pivot)
                ans[items++]=num;
        }
        return ans;
    }
}