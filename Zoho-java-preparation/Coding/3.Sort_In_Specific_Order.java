import java.util.Arrays;
class Sort_In_Specific_Order {
    public static void main(String args[]){
        int arr[]={1,2,3,5,4,7,10};
        int len=arr.length;
        int odd=0;
        int even=arr.length-1;
        int sorted[]=new int[len];
        Arrays.sort(arr);
        // 012345679
        for(int i=len-1;i>=0;i--){
            if(arr[i]%2==0)
                sorted[even--]=arr[i];
            else
                sorted[odd++]=arr[i];
        }
        System.out.println(Arrays.toString(sorted));
    }
}
