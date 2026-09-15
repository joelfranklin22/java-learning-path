import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int arr[] = { -4, 1, 3, 2, -2 };
        int target = 2;
        System.out.println(twoSum(arr, target));
    }

    static boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target)
                return true;
            else if (sum < target)
                i++;
            else
                j--;
        }

        return false;

    }
}
