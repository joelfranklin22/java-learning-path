class Missing_Number_Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int len = arr.length + 1;

        int sum = 0;
        int add = 0;
        for (int i = 1; i <= len; i++) {
            sum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        System.out.println("Missing Number" + (sum - add));
    }
}
