class Number_Occurence {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("value of arr" + arr[i]);
            if (arr[i] == target)
                count++;
            if (arr[i + 1] > target) {
                break;
            }

        }
        System.out.println(count);
    }
}
