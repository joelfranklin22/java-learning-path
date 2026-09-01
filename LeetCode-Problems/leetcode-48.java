class Solution {
    public void rotate(int[][] rotate) {
        int len = rotate.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                temp = rotate[i][j];
                rotate[i][j] = rotate[j][i];
                rotate[j][i] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            int start = 0;
            int end = len - 1;
            while (start < end) {
                temp = rotate[i][start];
                rotate[i][start] = rotate[i][end];
                rotate[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}