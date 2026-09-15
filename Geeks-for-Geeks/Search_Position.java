class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int st=0,end=len-1,mid;
        while(st<=end)
        {
            mid=(st+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                    end=mid-1;
            else    
                    st=mid+1;;
        }
        return st;
    }
}
class Search_Position
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int a[]={1,2,3,5,6};
        int target=7;
        System.out.print("Result"+s.searchInsert(a,target));
    }
}
