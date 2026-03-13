class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum=0;
        for(int i=0;i<=s.length()-1;i++){
             int value = hm.get(s.charAt(i));

            if(i < s.length()-1 && value < hm.get(s.charAt(i+1))){
                sum -= value;

        }
        else{
            sum+=value;
        }
        }
        return sum;
    }
}