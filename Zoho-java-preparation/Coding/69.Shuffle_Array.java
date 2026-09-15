import java.util.Random;

class Shuffle_Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        randomNumber(arr);
        for (int num : arr)
            System.out.print(num);
    }

    static int[] randomNumber(int arr[]) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}
