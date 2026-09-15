import java.util.Scanner;

class Currency_Notes {
    public static void main(String[] args) {
        int arr[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int notes[] = new int[arr.length];
        Scanner s = new Scanner(System.in);
        int currency = s.nextInt();
        // 2456
        for (int i = 0; i < notes.length; i++) {
            if (currency >= arr[i]) {
                notes[i] = currency / arr[i];
                currency = currency % arr[i];
            }
        }
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != 0) {
                System.out.println(arr[i] + ":" + notes[i]);
            }
        }
        s.close();
    }

}
