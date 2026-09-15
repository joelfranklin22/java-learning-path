import java.util.*;

class Form_Largest_Number {
    public static void main(String args[]) {
        int arr[] = {0,0 };
        String[] str = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();

        for (String s : str) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') {
            System.out.println(0);
        }

        System.out.println(sb.toString());
    }
}
