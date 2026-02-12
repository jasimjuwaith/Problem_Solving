class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findOccurence(nums, target), lastOccurence(nums, target)};
    }

    public static int findOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        if ((end + 1 < nums.length) && nums[end + 1] == target) {
            return end + 1;
        }
        return -1;
    }

    public static int lastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        if ((start - 1 >= 0) && nums[start - 1] == target) {
            return start - 1;
        }
        return -1;
    }
}