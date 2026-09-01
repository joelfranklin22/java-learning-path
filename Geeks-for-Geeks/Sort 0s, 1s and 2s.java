class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int i,v,j,len,count=0;
        len=arr.length;
        for( i=0;i<len && arr[i]<3;i++)
        {
            count++;
            v = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > v; j--)
                arr[j + 1] = arr[j];
            arr[j + 1] = v;
        }
        if (count == len)
        {
            for (i = 0; i < len; i++)
                System.out.println(arr[i]);
        }
        else
            System.out.println("Invalid input");
    }
}
class call
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int arr[]={0,1,2,0,1,2};
        s.sort012(arr);
    }
}