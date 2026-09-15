class Kadane_Algorithm {
    public static void main(String args[]) {
        int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
        int current_Sum = arr[0];
        int max_Sum = arr[0];
        int start = 0;
        int end = 0;
        int temp = 0;
        // Prints Both Final Answer and SubArray
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > current_Sum + arr[i]) {
                current_Sum = arr[i];
                temp = i;
            } else {
                current_Sum += arr[i];
            }
            if (current_Sum > max_Sum) {
                max_Sum = current_Sum;
                start = temp;
                end = i;
            }
        }
        System.out.println("Final Answer" + max_Sum);
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i] + " ");
        }
        // direct Final Answer
        for (int i = 1; i < arr.length; i++) {
            current_Sum = Math.max(arr[i], current_Sum + arr[i]);
            max_Sum = Math.max(current_Sum, max_Sum);
        }
    }
}

