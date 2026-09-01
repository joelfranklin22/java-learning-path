import java.util.*;
class time
{
    public static void main(String args[])
    {
        int i,j,k;
        List<Integer> l1=new LinkedList<>();
        List<Integer> l2=new ArrayList<>();
        for(i=0;i<=100000;i++)
        {
            l1.add(i);
            l2.add(i);
        }
        // Get Method for LinkedList
        long start1=System.nanoTime();
        int x=l1.get(100000);
        long end1=System.nanoTime();
        //Add Method for LinkedList
        long start2=System.nanoTime();
        for(j=100000;j<=200000;j++)
            l1.add(j);
        long end2=System.nanoTime();

        // Get Method for ArrayList
        long start3=System.nanoTime();
        int x1=l1.get(100000);
        long end3=System.nanoTime();
        //Add Method for ArrayList
        long start4=System.nanoTime();
        for( k=100000;j<=200000;j++)
            l1.add(k);
        long end4=System.nanoTime();


        System.out.println("Get method for LinkedList --"+(end1-start1)+"ms");
        System.out.println("Add method for LinkedList --"+(end2-start2)+"ms");
        System.out.println("Get method for ArrayList--"+(end3-start3)+"ms");
        System.out.println("add method for ArrayList--"+(end4-start4)+"ms");


        System.out.println("get difference"+((end1-start1)-(end3-start3)));
                System.out.println("Add difference"+((end2-start2)-(end4-start4)));

    }
}