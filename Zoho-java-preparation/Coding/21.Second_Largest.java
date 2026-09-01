
class Second_Largest {
    public static void main(String args[]) {
        int arr[] = { 12, 12, 12, 12, 12 };
        int firstLargest = arr[0];
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                second = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > second && arr[i] < firstLargest) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
