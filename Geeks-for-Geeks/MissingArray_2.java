class Solution {
    int missingNum(int arr[]) {
	int len=arr.length;
	int xor1=0,xor2=0;

	for(int i=1;i<=len+1;i++)
		xor1^=i;

	for(int i=0;i<len;i++)
		xor2^=arr[i];

	return xor1^xor2;
	}
}

class Missing
{
	public static void main(String args[])
	{
		Solution s6=new Solution();
		int a[]={1,2,3,5};
		int ans=s6.missingNum(a);
		System.out.println("Result ::"+ans);
	}
}