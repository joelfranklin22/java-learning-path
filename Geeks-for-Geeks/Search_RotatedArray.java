class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int start=0,end=len-1,mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(nums[mid]==target)
                    return mid;
            if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && target<nums[mid])
                        end=mid-1;
                else
                        start=mid+1;
            }
            else
            {
                if(nums[mid]<=target && target<=nums[end])
                        start=mid+1;
                else 
                        end=mid-1;
            }
        }
        return -1;
    }
}
class Search_RotatedArray
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int a[]={4,5,6,0,1,2};
        int target=0;
        System.out.println("Result "+s.search(a,target));
    }
}
