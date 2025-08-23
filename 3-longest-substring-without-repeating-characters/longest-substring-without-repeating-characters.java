class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int ans=0;
        HashSet<Character>hm=new HashSet<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(!hm.contains(ch)){
                hm.add(ch);
            }
            else{
                while(hm.contains(ch)){
                    hm.remove(s.charAt(l));
                    l++;
                }
                hm.add(ch);
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}