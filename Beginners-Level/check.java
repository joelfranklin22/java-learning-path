class check
{
public static void main(String args[])
{
	String s1="011111100";
	String [] a=s1.split("11111");
	
for(String b:a)	{
	//dbhvd
	System.out.println(b);
	a[1]="0";
	}
}