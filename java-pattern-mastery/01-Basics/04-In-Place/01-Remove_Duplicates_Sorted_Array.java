
class Remove_Duplicates_Sorted_Array {

    public static void main(String args[]) {
        int nums[] = {11, 11, 12, 12, 1, 1, 1, 0, 0, 1};
        System.out.print(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
