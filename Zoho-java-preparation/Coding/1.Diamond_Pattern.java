import java.util.Scanner;

class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        int k;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");
                    System.out.print(" ");
            }
            System.out.println();
        }
        // Downwards
        for (int i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}