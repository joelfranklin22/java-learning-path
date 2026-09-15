import java.util.ArrayList;

 class Index_Subarray_Sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int target = 12;
        int left = 0;
        int sum = 0;
        int right = 0;
        ArrayList<Integer> l1 = new ArrayList<>();
        for (right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > target && left <= right) {
                sum -= arr[left++];
            }
            if (sum == target) {
                l1.add(left + 1);
                l1.add(right + 1);
                System.out.print(l1);
                break;
                // return l1;
            }
        }
        l1.add(-1);
        // return l1;
        if (l1.size() == 0)
            System.out.println(l1);
    }
}
