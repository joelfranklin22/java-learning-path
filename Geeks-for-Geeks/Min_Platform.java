// User function Template for Java
import java.util.Arrays;
class Solution {
    static int findPlatform(int arr[], int dep[]) {
      	int i=1,j=0,max=1,platform=1;
	int n=arr.length;
	Arrays.sort(arr);
	Arrays.sort(dep);
	while(i<n&&j<n)
	{
		if(arr[i]<=dep[j])		
		{
			platform++;
			i++;
		}
		else
		{
			platform--;
			j++;
		}
		if(platform>max)
			max=platform;
	}
	return max;
    }
}
class  Min_Platform
{
	public static void main(String args[])
	{
		Solution s=new Solution();
		int arrival[]={900, 940, 950, 1100, 1500, 1800};
		int dep[]={910, 1200, 1120, 1130, 1900, 2000};
		System.out.println("Max no of Platform used"+s.findPlatform(arrival,dep));

	}
}