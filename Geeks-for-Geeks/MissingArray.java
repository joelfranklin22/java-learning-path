class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        long total = (long) n * (n + 1) / 2;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (int)(total - sum);
    }
}

class MissingArray
{
	public static void main(String args[])
	{
		Solution s6=new Solution();
		int a[]={1,2,3,5};
		int ans=s6.missingNum(a);
		System.out.println("Result ::"+ans);
	}
}