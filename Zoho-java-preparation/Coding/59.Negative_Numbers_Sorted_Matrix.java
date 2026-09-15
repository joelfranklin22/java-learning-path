class Negative_Numbers_Sorted_Matrix {
    public static void main(String[] args) {
        int arr[][] = { { 4, 3, 2, 1 }, { 3, 2, 1, 1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(Negative_Count(arr));
    }

    static int Negative_Count(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0;
        int j = cols - 1;

        int count = 0;

        while (i < rows && j >= 0) {
            if (arr[i][j] < 0) {
                count += rows - i;
                j--;
            } else {
                i++;
            }
        }
        return count;
    }

}
