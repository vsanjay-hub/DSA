import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hm = new HashSet<>();
        int l = 0;
        long ans = 0, temp = 0;
        int n = nums.length;

        for (int r = 0; r < n; r++) {
 
            while (hm.contains(nums[r])) {
                hm.remove(nums[l]);
                temp -= nums[l];
                l++;
            }

            hm.add(nums[r]);
            temp += nums[r];
 
            if (r - l + 1 == k) {
                ans = Math.max(ans, temp);

 
                hm.remove(nums[l]);
                temp -= nums[l];
                l++;
            }
        }
        return ans;
    }
}
