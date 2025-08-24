class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];

        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                left[i] = nums[i];
            } else {
                left[i] = Math.max(left[i - 1], nums[i]);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0) {
                right[i] = nums[i];
            } else {
                right[i] = Math.max(right[i + 1], nums[i]);
            }
        }

        int[] ans = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            ans[i] = Math.max(right[i], left[i + k - 1]);
        }
        return ans;
    }
}
