import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>m1=new HashMap<>();
        int len=numbers.length;
        int current=0;
        for(int i=0;i<len;i++)
        {
            current=target-numbers[i];
            if(m1.containsKey(current))
                return new int[]{m1.get(current),i};
            m1.put(current,i);
        }
        return new int[]{-1,-1};
    }
}
class Peak
{
    public static void main(String args[])
    {
        Solution c = new Solution();
        int a[] = { 1, 3, 4, 2, 4, 6, 4, 2, 3, 1 };
        int target = 4;
        int result[]=c.twoSum(a,target);
        System.out.println(Arrays.toString(result));
    }
}