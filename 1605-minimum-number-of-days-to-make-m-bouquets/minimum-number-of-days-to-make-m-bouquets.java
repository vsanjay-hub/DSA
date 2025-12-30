class Solution {
    boolean ispossible(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
            if (bouquets >= m) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long need = (long) m * k;
        if (need > bloomDay.length) return -1;
        int l = 1, r = 0;
        for (int d : bloomDay) r = Math.max(r, d);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (ispossible(bloomDay, m, k, mid))
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}
