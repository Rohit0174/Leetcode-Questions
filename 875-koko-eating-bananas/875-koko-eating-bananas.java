class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
        int high=0;
        for(Integer i:piles)
            high=Math.max(high,i);
        
        int low=0;
        int ans=0;
        //  if(piles.length==1){
        //  return low+(high-low)/2;   
        // }
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            if(mid==0)break;
            for(Integer i:piles){
                
                sum=sum+(i/mid);
                if(i%mid!=0)
                    sum=sum+1;
            }
            if(sum<=h){
                ans=mid;
                high=mid-1;
            }else if(sum>h){
                low=mid+1;
            }
        }
        return ans;
    }
}