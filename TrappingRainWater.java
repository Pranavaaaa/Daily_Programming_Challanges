public class TrappingRainWater {

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // Water trapped depends on the leftMax
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                // Water trapped depends on the rightMax
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total water trapped: " + trap(height1)); // Output: 6

        // Test case 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Total water trapped: " + trap(height2)); // Output: 9

        // Test case 3
        int[] height3 = {1, 1, 1};
        System.out.println("Total water trapped: " + trap(height3)); // Output: 0

        // Test case 4
        int[] height4 = {5};
        System.out.println("Total water trapped: " + trap(height4)); // Output: 0

        // Test case 5
        int[] height5 = {2, 0, 2};
        System.out.println("Total water trapped: " + trap(height5)); // Output: 2
    }
}
