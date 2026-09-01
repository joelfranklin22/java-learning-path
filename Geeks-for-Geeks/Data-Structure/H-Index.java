class Solution {
    public int hIndex(int[] a) {
        int len=a.length;
        int b[]=new int[len+1];
        int h,i;
        for(i=0;i<len;i++)
        {
            if(a[i]>=len)
                b[len]+=1;
            else
                b[a[i]]+=1;
        }
        int total=0;
        for(h=len;h>=0;h--)
        {
             total+=b[h];
            if(total>=h)
                return h;
        }
        return 0;
    }
}
class HIndex {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {3, 0, 6, 5, 1};
        System.out.println("Result: " + s.hIndex(a)); 
    }
}
