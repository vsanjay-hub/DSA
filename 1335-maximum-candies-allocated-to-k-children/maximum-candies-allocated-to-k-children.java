class Solution {
    public boolean ispossible(int[] candies,long k,int n){
        for(int i=0;i<candies.length;i++){
            int q=candies[i]/n;
            k=k-q;
            if(k<=0){
                return true;
            }

        }
        return false;

    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=(int)Math.pow(10,7);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(candies,k,mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(r== -1){
            return 0;
        }
        return r;
        
    }
}  