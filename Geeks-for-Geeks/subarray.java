import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
         ArrayList<Integer> l1 = new ArrayList<>();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if (sum == target) {
                    l1.add(i + 1); // Convert to 1-based index
                    l1.add(j + 1);
                    return l1;
                } else if (sum > target) {
                    break;
                }
            }
        }

        l1.add(-1);
        return l1;
    }
}
class subarray
{
	public static void main(String args[])
	{
		Solution s5=new Solution();
		int a[]={1,2,3,4,5};
		int target=15;
		ArrayList<Integer>l1=s5.subarraySum(a,target);
		System.out.println("ans"+l1);
	}
}