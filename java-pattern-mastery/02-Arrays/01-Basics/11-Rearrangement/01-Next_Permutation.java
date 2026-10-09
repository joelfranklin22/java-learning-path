
class Next_Permutation {

    public static void main(String[] args) {

        int nums[] = {1, 1, 5};

        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            while (nums[i] >= nums[j]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp = nums[left];
            nums[right] = nums[left];
            nums[left] = temp;
        }

        for (int result : nums) {
            System.out.print(result + " ");
        }
    }
}
