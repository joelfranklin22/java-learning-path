import java.util.Arrays;

class Pair_Sum_Closest_0 {

    public static void main(String args[]) {

        int arr[] = { -21, -67, -37, -18, 4, -65 };

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        int min = Integer.MAX_VALUE;
        int result=0;
        int sum;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(min)) {
                min = sum;
                result = sum;
            }
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result = 0;
                break;
            }
        }
            System.out.println(result);
    }
}