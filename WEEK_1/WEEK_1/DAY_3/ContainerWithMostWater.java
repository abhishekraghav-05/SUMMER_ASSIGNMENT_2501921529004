class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Width between the two bars
            int width = right - left;

            // Height is limited by the shorter bar
            int minHeight = Math.min(height[left], height[right]);

            // Calculate area
            int area = width * minHeight;

            // Update maximum area
            maxArea = Math.max(maxArea, area);

            // Move the pointer at the shorter bar inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}