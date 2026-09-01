class Solution {
    public String reverseWords(String s) {
        // Code here
	String[] words=s.split("\\.+");
		int n=words.length;
		String result="";
		for(int i=n-1;i>=0;i--)
		{
			if (!words[i].isEmpty()) 
			{
              		  if (!result.equals("")) 
				{
                   			 result += ".";
                		}
               		 result += words[i];
 	      		 }
		}
		return result;
    }
}
class reverse_dot
{
	public static void main(String args[])
	{	
		Solution s1=new Solution();
		String s="...i..like..this...program..very...much....";
		String output=s1.reverseWords(s);
		System.out.println("final Reversed String---"+output);
	}
}
		