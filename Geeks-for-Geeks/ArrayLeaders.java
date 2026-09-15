import java.util.ArrayList;
import java.util.Collections;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
	ArrayList<Integer>l1=new ArrayList<>();
	int i=0,len;
	len=arr.length;
	int max=arr[len-1];
	l1.add(max);
	for(i=len-2;i>=0;i--)
	{
		if(arr[i]>=max)
		{
			max=arr[i];
			l1.add(max);
		}	
	}
        Collections.reverse(l1);
	return l1;
    }
}
class ArrayLeaders
{
	public static void main(String args[])
	{
		Solution s1=new Solution();
		int a[]={5,10,40,40};
		ArrayList<Integer>l1=s1.leaders(a);
		System.out.println(l1);
	}
}