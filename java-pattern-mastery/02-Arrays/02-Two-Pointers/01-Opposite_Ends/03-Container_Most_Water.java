
class Container_Most_Water {

    public static void main(String[] args) {

        int nums[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(nums));
    }

    static int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while (i < j) {
            int width = Math.abs(i - j);
            int min_height = Math.min(height[i], height[j]);
            int volume = width * min_height;
            max = Math.max(volume, max);
            if (height[i] <= height[j]) {
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
}
