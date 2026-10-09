import java.util.HashSet;

class Find_Only_Repetitive_Element {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 1, 2, 3, 4 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        // code here
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (s1.contains(arr[i]))
                return arr[i];
            s1.add(arr[i]);
        }
        return -1;
    }
}
