class hi
{
	void metho()
	{
	int a=5,b=10;
	System.out.println("class check");
	}
		class check extends hi
		{
			void add()
			{
				int er=10;
				System.out.println(er);
			}	
	check yy=new check();
	yy.add();
		}

}
class checking
{
public static void main(String args[])
{
	//sg
	hi o=new hi();
	o.metho();	
}
}
	
