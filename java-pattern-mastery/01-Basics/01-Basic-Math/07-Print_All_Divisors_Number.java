import java.util.ArrayList;

class Print_All_Divisors_Number {
    public static void main(String[] args) {
        int n = -1000;
        System.out.println(divisors(n));
    }

    static ArrayList<Integer> divisors(int n) {

        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                l1.add(i);
        }
        return l1;
    }
}
