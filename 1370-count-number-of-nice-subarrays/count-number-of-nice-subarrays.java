class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l1 = 0, l2 = 0;
        int count1 = 0, count2 = 0;
        int odd1 = 0, odd2 = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 1) {
                odd1++;
                odd2++;
            }

        
            while (odd1 > k) {
                if (nums[l1] % 2 == 1) odd1--;
                l1++;
            }

            // shrink l2 for atMost(k-1)
            while (odd2 > k - 1) {
                if (nums[l2] % 2 == 1) odd2--;
                l2++;
            }

            count1 += (r - l1 + 1);   
            count2 += (r - l2 + 1);   
        }

        return count1 - count2;   
    }
}
