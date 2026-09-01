// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int i = 0;
//         int j = nums.length - 1;

//         int first = -1;
//         int last = -1;

//         while (i < nums.length) {
//             if (nums[i] == target) {
//                 first = i;
//                 break;
//             }
//             i++;
//         }

//         while (j >= 0) {
//             if (nums[j] == target) {
//                 last = j;
//                 break;
//             }
//             j--;
//         }

//         return new int[] { first, last };
//     }
// }
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int i = 0;
//         int j = nums.length - 1;
//         int first = -1;
//         int last = -1;
//         while (i <= j) {
//             if (nums[i] == target && first == -1) {
//                 first = i;
//             }
//             if (nums[j] == target && last == -1) {
//                 last = j;
//             }
//             if (first != -1 && last != -1) {
//                 break;
//             }
//             if (first == -1)
//                 i++;
//             if (last == -1)
//                 j--;
//         }
//         return new int[] { first, last };
//     }
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(start==-1){
                    start=i;
                }
                end=i;
            }
        }
        return new int[]{start,end};
    }
}