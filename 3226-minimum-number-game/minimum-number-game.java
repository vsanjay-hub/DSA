import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }

        int[] result = new int[nums.length];
        int k = 0;
        while (!pq.isEmpty()) {
            int x = pq.poll(); 
            int y = pq.poll();

            result[k++] = y;
            result[k++] = x;
        }

        return result;
    }
}
