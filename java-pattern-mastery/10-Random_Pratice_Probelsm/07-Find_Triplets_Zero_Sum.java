class Find_Triplets_Zero_Sum {
    public static void main(String[] args) {
        int arr[] = { -1, 1, 0, 2, 3, 1 };
        System.out.println(findTriplets(arr));
    }

    static boolean findTriplets(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}