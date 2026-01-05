class Solution {

    public boolean isPossible(int[] position, int m, int k) {
        int prev = position[0];
        m--;

        for (int i = 1; i < position.length; i++) {
            int val = position[i];

            if (val - prev >= k) {
                m--;
                prev = val;
            }

            if (m == 0) {
                return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int l = 1;
        int r = 0;

        for (int i = 0; i < position.length; i++) {
            r = Math.max(r, position[i] - position[0]);
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isPossible(position, m, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
}
