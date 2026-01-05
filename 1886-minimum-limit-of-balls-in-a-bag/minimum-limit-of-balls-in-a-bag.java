class Solution {
    public static boolean func(int []nums, int maxOperations,int mid){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=nums[i]/mid;
            if(nums[i]%mid!=0){
                temp++;
            }
            temp --;
            maxOperations=maxOperations-temp;
            if(maxOperations<0){
                return false;
            }
        }return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=1000000000;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(func(nums,maxOperations,mid)){
                r= mid -1;
            }
            else{
                l = mid + 1;

            }
        }return l;
    }
}