class Smallest_Index_Equal_Value {

    public static void main(String args[]) {

        int arr[] = { 0, 1, 2 };
        System.out.println("Smallest Number" + SmallestIndex(arr));
    }

    static int SmallestIndex(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (i % 10 == arr[i])
                return i;
        }
        return -1;
    }
}
