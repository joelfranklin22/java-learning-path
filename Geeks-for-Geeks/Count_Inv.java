class Solution 
{
 
    static int inversionCount(int arr[]) 
	{
		int i,j,count=0;
		int len=arr.length;
		for(i=0;i<len;i++)
		{
			j=i+1;
			while(i<j)
			{
				if(arr[i]>arr[j])
					count++;
				j++;
			}
		}	
		return count;
    	}

}
class count_inv
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7};
        Solution s = new Solution();
        int ans = s.inversionCount(a);
        System.out.println(ans);
    }
}