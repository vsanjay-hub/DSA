class Solution {

    boolean isPossible(int[] nums, int threshold, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + k - 1) / k; 
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = (low + high) / 2;
            if (isPossible(nums, threshold, mid))
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
