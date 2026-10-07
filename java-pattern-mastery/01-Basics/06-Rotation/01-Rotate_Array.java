
class Rotate_Array {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k %= nums.length;

        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);

        for (int result : nums) {
            System.out.println(result);
        }
    }

    static void swap(int nums[], int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
