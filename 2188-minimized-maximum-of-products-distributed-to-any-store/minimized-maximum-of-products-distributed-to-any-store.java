class Solution {
    public static boolean isPossible(int n,int[] quantities,int maxVal){
        for(int i=0;i<quantities.length;i++){
            int curr=quantities[i];
            while(curr >= maxVal){
                curr-=maxVal;
                n-=1;
            }
            if(curr < maxVal && curr !=0){
                curr=0;
                n-=1;
            }
        }
        if(n<0){
            return false;
        }
        return true;

    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=(int)Math.pow(10,5);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(n,quantities,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
        
    }
}