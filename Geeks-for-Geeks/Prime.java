class Solution {
    static boolean isPrime(int n) {
        // code here
	Boolean result=false;
	int i=0;
	if(n==1)	
		result=false;
	else if(n==2 || n==3 || n==5)
		result=true;
	else if(n>3)
	{
		if(n%2==0)
			result=false;
		else
			{
				result=true;
				for(i=3;i<=n/2;i+=2)
				{
					if(n%i==0)
					{
						result=false;
						break;
					}
				}
			}
	}
     return result;
    }
}
class Prime
{
	public static void main(String args[])
	{
		Solution s7=new Solution();
		int n=25;
		Boolean result=s7.isPrime(n);
		System.out.println(result);
	}
}