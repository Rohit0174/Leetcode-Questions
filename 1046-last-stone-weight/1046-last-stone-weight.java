class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(Integer num:stones){
            pq.add(num);
        }
        while(pq.size()>=1){
            if(pq.size()>=2){
                int a=pq.remove()-pq.remove();
                if(a!=0){
                    pq.add(a);
                }
            }
            if(pq.size()==1)return pq.peek();
        }
        if(pq.size()==0)
            return 0;
        return pq.peek();
    }
}