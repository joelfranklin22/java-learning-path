
class sort_colors {

    public static void main(String[] args) {

        int nums[] = {1, 2, 0, 0, 2, 1, 2, 1, 0};

        // Method -1 using In-Place by Dutuch National Flag
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
                case 2 -> {
                    swap(nums, mid, high);
                    high--;
                }
                default -> {
                    mid++;
                }
            }
        }

        // Method-2 count 1s,2s,0s first then place in the array
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        System.out.println(twos);
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0 -> {
                    zeros++;
                }
                case 1 -> {
                    ones++;
                }
                case 2 -> {
                    twos++;
                }
            }
        }
        int j = 0;
        while (j < zeros) {
            nums[j] = 0;
            j++;
        }
        while (j < zeros + ones) {
            nums[j] = 1;
            j++;
        }
        while (j < nums.length) {
            nums[j] = 2;
            j++;
        }
        // Method -3 using Insertion sort
        int v = 0;
        int a = 0;
        System.out.println(v + ":" + a);
        for (int i = 0; i < nums.length; i++) {
            v = nums[i];
            for (a = i - 1; a >= 0 && nums[a] > v; a--) {
                nums[a + 1] = nums[j];
            }
            nums[a + 1] = v;
        }
    }

    static void swap(int nums[], int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
