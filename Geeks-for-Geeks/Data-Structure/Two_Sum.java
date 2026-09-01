class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m1=new HashMap<>();
        int len=nums.length;
        int current_value,target_value;
        for(int i=0;i<len;i++)
        {
                current_value=nums[i];
                target_value=target-current_value;
                if(m1.containsKey(target_value))
                        return new int[]{m1.get(target_value),i};
                m1.put(current_value,i);
        }
        return new int[]{-1,-1};
    }
}
class Two_Sum
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int a[]={2,7,11,15};
        int target=23;
        int result[]=s.twoSum(a,target);
        System.out.println(Arrays.toString(result));
    }
}