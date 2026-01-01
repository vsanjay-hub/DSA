class Solution {

    public boolean isPossible(int[] weights, int days, int k) {
        int temp = 0;
        int usedDays = 1;

        for (int i = 0; i < weights.length; i++) {
            int val = weights[i];

            if (val > k) {
                return false;
            }

            if (temp + val > k) {
                usedDays++;
                temp = 0;
            }

            temp += val;

            if (usedDays > days) {
                return false;
            }
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;

        for (int i = 0; i < weights.length; i++) {
            l = Math.max(l, weights[i]);
            r += weights[i];
        }

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (isPossible(weights, days, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
