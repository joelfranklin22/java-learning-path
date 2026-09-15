class Solution {
    public int hIndex(int[] citations) {
        int len=citations.length;
        int count[]=new int[len+1];
        for(int i=0;i<len;i++)
        {
            if(citations[i]>len)
                count[len]++;
            else
                count[citations[i]]++;;
        }

        int leastCitation=0;
        for(int i=len;i>=0;i--)
        {
            leastCitation+=count[i];
            if(leastCitation>=i)
                return i;
        }
        return 0;
    }
}