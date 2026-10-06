
class Remove_Element {

    public static void main(String args[]) {
        int nums[] = {11, 11, 12, 12, 1, 1, 1, 0, 0, 1};
        int val = 0;
        System.out.print(removeElements(nums, val));
    }

    static int removeElements(int[] nums, int val) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
