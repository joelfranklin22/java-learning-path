class Three_Sum {
    public static void main(String args[]) {
        int arr[] = { 1, 12, 0, 32, 1, 4, 8, 10, 2, 23 };
        int target = 5;
        System.out.println(hasTripletSum(arr, target));
    }

    static boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int i = 0;

        while (i < arr.length - 2) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target)
                    return true;
                else if (sum < target)
                    left++;
                else
                    right--;
            }
            i++;
        }
        return false;
    }
}