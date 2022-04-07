class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer i:stones){
            list.add(i);
        }
        
        Collections.sort(list);
        int i=list.size()-1;
        while(i>0){
            if(list.get(i)==list.get(i-1)){
                list.remove(i);
                list.remove(i-1);
                i-=2;
                
            }else{
                int a=list.get(i)-list.get(i-1);
                list.remove(i);
                list.remove(i-1);
                list.add(a);
                i-=1;
            }
            Collections.sort(list);
        }
        if(list.size()==0)return 0;
        return list.get(0);
    }
}