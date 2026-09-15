import java.util.Arrays;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int len=arr.length;
        int largest_element=-1;
        for(int i=len-2;i>=0;i--)
        {
            if (arr[len - 1] > arr[i])
            {
                largest_element = arr[i];
                break;
            }
        }
            return largest_element;
    }
}
class sec
{
public static void main(String args[])
{
    Solution s1=new Solution();
    int a[]={12, 35, 1, 10, 34, 1};
    int ans = s1.getSecondLargest(a);
   System.out.println(ans);
}
}