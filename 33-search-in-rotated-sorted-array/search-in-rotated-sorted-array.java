class Solution {
    public int search(int[] nums, int target) {
        return searchHelper(nums, target, 0, nums.length - 1);
    }

    private int searchHelper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] >= nums[start]) {
            if (nums[start] <= target && target < nums[mid]) {
                return searchHelper(nums, target, start, mid - 1);
            } else {
                return searchHelper(nums, target, mid + 1, end);
            }
        } else { 
            if (nums[mid] < target && target <= nums[end]) {
                return searchHelper(nums, target, mid + 1, end);
            } else {
                return searchHelper(nums, target, start, mid - 1);
            }
        }
    }
}
