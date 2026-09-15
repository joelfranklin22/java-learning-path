import java.util.*;

class Third_Largest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(thirdLargest(arr));
    }

    static int thirdLargest(List<Integer> arr) {
        // code here

        if (arr.size() < 3)
            return -1;
        Collections.sort(arr);

        return arr.get(arr.size() - 3);
    }
}
