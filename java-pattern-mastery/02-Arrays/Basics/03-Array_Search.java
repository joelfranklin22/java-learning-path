class Array_Search {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 45, 23, 4, 1 };
        int x = 1;
        System.out.println(search(arr, x));
    }

    static int search(int arr[], int x) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
