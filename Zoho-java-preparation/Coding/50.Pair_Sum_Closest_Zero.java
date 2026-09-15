import java.util.Arrays;

class Pair_Sum_Closest_Zero {
    public static void main(String[] args) {
        int arr[] = { -8, -66, -60 };
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;
        int closest = Integer.MAX_VALUE;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(sum)) {
                closest = sum;
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }
        System.out.println(closest);
    }
}
