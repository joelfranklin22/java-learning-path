// Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum=target-nums[i];
            if(m1.containsKey(sum))
                return new int []{m1.get(sum),i};
            m1.put(nums[i],i);
        }
        return new int []{-1,-1};
    }
}