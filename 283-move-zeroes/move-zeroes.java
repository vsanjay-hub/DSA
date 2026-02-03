import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int zeroCount = 0;

        
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                list.add(num);
            }
        }

        int i = 0;

        
        for (int x : list) {
            nums[i++] = x;
        }
 
        while (zeroCount > 0) {
            nums[i++] = 0;
            zeroCount--;
        }
    }
}
