class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int c1=0;
        int c2=0;
        int ele1=0;
        int ele2=0;
        for(int num:nums){
            if(c1==0&&num!=ele2){
                c1++;
                ele1=num;
            }
            else if(c2==0&&num!=ele1){
                c2++;
                ele2=num;
            }
            else if(ele1==num){
                c1++;
            }
             else if(ele2==num){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (num == ele1) c1++;
            else if (num == ele2) c2++;
        }
         List<Integer> res = new ArrayList<>();
        if (c1 > n / 3) res.add(ele1);
        if (c2 > n / 3) res.add(ele2);

        return res;
    }
}
