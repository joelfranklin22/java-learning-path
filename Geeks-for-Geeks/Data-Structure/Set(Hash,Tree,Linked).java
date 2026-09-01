import java.util.*;
class Settest
{
    public static void main(String args[])
    {
        int i;
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new TreeSet<>();
        Set<Integer>s3=new LinkedHashSet<>();

        int a[]={1,2,98,88,443,3,4,12,11,14,1,5,1,2,3,4,5,1,2,3,4,5,6,10}        ;
        for(i=0;i<a.length;i++)
        {
            s1.add(a[i]);
            s2.add(a[i]);
            s3.add(a[i]);
        }
        System.out.println("HashSet"+s1);
        System.out.println("TreeSet"+s2);
        System.out.println("LinkedSet"+s3);
    }
}