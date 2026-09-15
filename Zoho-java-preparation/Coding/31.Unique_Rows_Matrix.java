import java.util.ArrayList;
import java.util.HashSet;

class Unique_Rows_Matrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 0, 1 }, { 1, 0, 1, 1 }, { 1, 0, 0, 1 } };
        ArrayList<ArrayList<Integer>> l1 = new ArrayList<>();
        HashSet<String> s1 = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mat.length; i++) {
            sb.setLength(0);
            for (int j = 0; j < mat[0].length; j++) {
                sb.append(mat[i][j]);
            }
            String row = sb.toString();
            if (!s1.contains(row)) {
                s1.add(row);
                ArrayList<Integer> l2 = new ArrayList<>();

                for (int j = 0; j < mat[0].length; j++) {
                    l2.add(mat[i][j]);
                }
                l1.add(l2);
            }
        }
        System.out.println(l1);
    }
}
