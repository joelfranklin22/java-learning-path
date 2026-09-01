import java.util.*;
class check
{
	public void addition(ArrayList<Integer> l1)
{
	l1.add(5);
	l1.add(3,55);
	System.out.println(l1.get(5));
	System.out.println(l1);
}
}
class test
{
	public static void main(String args[])
	{
	check c=new check();
	ArrayList<Integer>l1=new ArrayList<>();
	int a[]={1,2,3,4,5,6};
	//l1.addAll(Arrays.asList(1,2,3,4,5,6));
	c.addition(l1);
	}
}