class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        
        for (int col = 0; col < cols; col++) {
            sort(mat, 0, col);
        }

        
        for (int row = 1; row < rows; row++) {
            sort(mat, row, 0);
        }

        return mat;
    }

    private void sort(int[][] mat, int row, int col) {

        ArrayList<Integer> list = new ArrayList<>();

        int r = row;
        int c = col;


        while (r < mat.length && c < mat[0].length) {
            list.add(mat[r][c]);
            r++;
            c++;
        }

        
        Collections.sort(list);

        
        r = row;
        c = col;
        int i = 0;

        while (r < mat.length && c < mat[0].length) {
            mat[r][c] = list.get(i++);
            r++;
            c++;
        }

    }
}