class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long result=0;
        for(int gift:gifts){
            pq.add(gift);
        }
        for(int i=0;i<k;i++){
            int max=pq.poll();
            int sqrt=(int) Math.sqrt(max);
            pq.add(sqrt);
        }
        for(int p :pq){
            result +=p;
        }
        return result;
    }
}