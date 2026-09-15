class Solution {
    public int majorityElement(int[] nums) {
      int candidate=0;
      int count=0;
      for(int value:nums) 
      {
        if(count ==0)
            candidate=value;
        if(candidate==value)
            count++;
        else
            count--;
      }
      return candidate;
    }
}