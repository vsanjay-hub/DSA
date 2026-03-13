class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder str=new StringBuilder(s);
        int n=str.length();
        for(int i=0;i<=n-1;i++){
            char ch=str.charAt(0);
            if(goal.equals(str.toString())){
                return true;
            }
            else{
                str.append(ch);
                str.deleteCharAt(0);
            }
        }
        return false;
    }
}