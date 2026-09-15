import java.util.Arrays;

class Sum_In_Matrix {
    public static void main(String args[]) {
        int nums[][] = { { 7, 2, 1 }, { 6, 4, 2 }, { 6, 5, 3 }, { 3, 2, 1 } };
        System.out.println(matrixSum(nums));
    }

    static int matrixSum(int[][] nums) {

        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
        int sum = 0;

        for (int j = 0; j < nums[0].length; j++) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }
            sum += max;
        }
        return sum;
    }
}
