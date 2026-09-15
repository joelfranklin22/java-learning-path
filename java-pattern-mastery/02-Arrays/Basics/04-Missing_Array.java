class Missing_Array {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 6, 7, 4 };
        System.out.println(missingNum(arr));
    }

    static int missingNum(int arr[]) {
        // code here
        int len = arr.length + 1;
        int sum = 0;
        int add = 0;
        for (int i = 1; i <= len; i++) {
            sum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        return sum - add;
    }
}
