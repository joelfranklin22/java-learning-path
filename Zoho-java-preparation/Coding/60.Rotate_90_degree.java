class Rotate_90_degree {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        int rows = arr.length;
        int cols = arr[0].length;
        int result[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < rows; i++) {
            for (int col = 0; col < cols; col++) {
                result[col][rows - 1 - i] = arr[i][col];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j]);
            }
            System.out.print("\n");
        }
    }
}
