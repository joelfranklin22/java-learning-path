
class Trapping_Rain_Water {

    public static void main(String[] args) {

        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(trap(height));
    }

    static int trap(int[] height) {

        int leftMax = height[0];
        int waterTrap = 0;
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        if (height.length == 0) {
            return 0;
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }
        int i = 0;
        while (i < height.length) {

            int waterLevel = Math.min(leftMax, rightMax[i]);
            int water = Math.max(0, waterLevel - height[i]);
            waterTrap += water;

            leftMax = Math.max(leftMax, height[i]);
            i++;
        }
        return waterTrap;
    }
}
