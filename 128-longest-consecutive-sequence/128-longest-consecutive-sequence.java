class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(Integer i:nums)
            hashSet.add(i);
        
        int longestStreak=0;
       for(Integer num:nums){
           if(!hashSet.contains(num-1)){
               int current_num=num;
               int current_streak=1;
               while(hashSet.contains(current_num+1)){
                   current_num+=1;
                   current_streak+=1;
               }
               longestStreak = Math.max(longestStreak,current_streak);
           }
       }
        return longestStreak;
    }
}