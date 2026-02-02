class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
         int i=0;
         for(int k=1;k<n;k++){
            if(nums[i]!=nums[k]){
            i++;
            nums[i]=nums[k];
            }
         }
         return i+1;
    }
}