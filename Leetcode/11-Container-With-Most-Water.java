class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int currentArea;
        while(left < right){
            currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(currentArea, maxArea);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }

        return maxArea;
    }
}