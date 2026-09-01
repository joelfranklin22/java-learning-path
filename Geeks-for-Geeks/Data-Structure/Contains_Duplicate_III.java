import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (valueDiff < 0 || indexDiff <= 0 || nums == null || nums.length == 0) return false;

        // Bucket size is valueDiff + 1 to ensure two values in same bucket differ by <= valueDiff
        Map<Long, Long> buckets = new HashMap<>();
        long size = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {
            long num = (long) nums[i];
            long bucketId = getBucketId(num, size);

            // Check same bucket
            if (buckets.containsKey(bucketId))
                return true;

            // Check adjacent buckets
            if (buckets.containsKey(bucketId - 1) && Math.abs(num - buckets.get(bucketId - 1)) <= valueDiff)
                return true;

            if (buckets.containsKey(bucketId + 1) && Math.abs(num - buckets.get(bucketId + 1)) <= valueDiff)
                return true;

            // Insert current element into its bucket
            buckets.put(bucketId, num);

            // Maintain sliding window of size indexDiff
            if (i >= indexDiff) {
                long oldBucketId = getBucketId((long) nums[i - indexDiff], size);
                buckets.remove(oldBucketId);
            }
        }

        return false;
    }

    // Helper to determine which bucket the number belongs to
    private long getBucketId(long num, long size) {
        return num < 0 ? (num + 1) / size - 1 : num / size;
    }
}
Class Contains_Duplicate_III
{
public static void main(String args[])
	{
		Solution s=new Solution();
		int a[]={1,2,3,1};
		int value-0,index=2;
		Boolean Result=s.containsNearbyAlmostDuplicate(a,index,value)
		System.out.println(Result);
	}
}