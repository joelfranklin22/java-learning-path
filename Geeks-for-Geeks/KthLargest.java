
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int i, j, v = 0;
        int len=arr.length;
        if(k<len)
        {
        for(i=0;i<len;i++)
        {
            v=arr[i];
            for(j=i-1;j>=0&&arr[j]>v;j--)
                arr[j+1]=arr[j];
            arr[j+1]=v;
        }
        }
        return arr[k-1];
    }
}
class k
{
    public static void main(String args[])
    {
        Solution s1=new Solution();
        int a [ ]={7, 10, 4, 3, 20, 15};
        int ans   = s1.kthSmallest(a,3); 
        System.out.println(ans);
    }
}