import java.util.*;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();  
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = 0;  
            
            for (int n1 : nums) {
                sum += (n1 + mid - 1) / mid;  
            }
            
            if (sum <= threshold) {
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(sol.smallestDivisor(nums, threshold));  
    }
}
