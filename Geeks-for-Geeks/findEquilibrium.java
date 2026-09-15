class Solution {
    public static int findEquilibrium(int arr[]) 
    {
	int i,j,total_sum=0,left_sum=0,len;
	len=arr.length;
	for(i=0;i<len;i++)
		total_sum+=arr[i];

	for(i=0;i<len;i++)
	{
		total_sum-=arr[i];
		if(total_sum==left_sum)
			return i;
		left_sum+=arr[i];
	}
	return -1;
    }
}
class findEquilibrium
{
	public static void main(String args[])
	{
		Solution s2=new Solution();
		int a[]={0,1,2,3};
		 int ans=s2.findEquilibrium(a);
		System.out.println("Result ::"+ans);
	}
}
