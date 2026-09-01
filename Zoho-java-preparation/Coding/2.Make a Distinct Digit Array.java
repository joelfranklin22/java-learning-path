import java.util.*;

class Distinct_Digit_Array {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();
        int arr[] = { 111, 222, 333, 444, 132, 789, 0 };

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == 0) {
                s1.add(0);
            }

            while (num != 0) {
                int digit = num % 10;
                s1.add(digit);
                num /= 10;
            }
        }
        System.out.print(s1);
    }
}
