class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            s1.add(nums[i]);
        int s1_len = s1.size();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> s2 = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                s2.add(nums[j]);
                if (s2.size() == s1_len)
                    count++;
            }
        }
        return count;
    }
}