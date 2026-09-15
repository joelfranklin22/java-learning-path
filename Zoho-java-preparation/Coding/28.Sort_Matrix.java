import java.util.Arrays;

class Sort_Matrix {
    public static void main(String[] args) {
        int matrix[][] = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int arr[] = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[k++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = arr[k++];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
