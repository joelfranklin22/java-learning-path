
class Remove_Duplicates_Sorted_Array {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,1,3,5,5,7};
        System.out.println();
    }
    static 	ArrayList<Integer> removeDuplicates(int[] arr) {
		// code here
		// TreeSet<Integer>s1=new TreeSet<>();
		// for(int i=0;i<arr.length;i++){
		//     s1.add(arr[i]);
		// }
		ArrayList<Integer>l1 = new ArrayList<>();
		
		l1.add(arr[0]);
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] != arr[i - 1])
				l1.add(arr[i]);
		}
		
		return l1;
	}
}
}