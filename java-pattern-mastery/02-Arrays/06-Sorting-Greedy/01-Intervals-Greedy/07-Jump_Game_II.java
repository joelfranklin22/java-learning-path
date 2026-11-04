
class Jump_Game_II {

    public static void main(String[] args) {

        int nums[] = {2, 3, 1, 1, 4};

        System.out.println(jump(nums));
    }

    static int jump(int[] nums) {

        int currEnd = 0;
        int maxReach = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > maxReach) {
                return 0;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == currEnd) {
                count++;
                currEnd = maxReach;
            }
        }
        return count;
    }
}
