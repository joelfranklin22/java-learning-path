class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}