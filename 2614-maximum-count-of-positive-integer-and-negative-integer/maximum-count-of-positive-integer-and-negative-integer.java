class Solution {
    public int leftmost(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>=target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
      
        }
           return s;
    }
    
    public int maximumCount(int[] nums) {
        int left=leftmost(nums,0);
        int one=leftmost(nums,1);
        int pos=nums.length-one;
        return Math.max(left,pos);
    }
    
}