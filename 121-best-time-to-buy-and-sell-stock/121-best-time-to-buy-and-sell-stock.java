class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int sell = -1;
        int max = 0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy)buy = arr[i];
            
            else
            {
                sell = arr[i];
                if((sell-buy)>max)
                    max=sell-buy;

            }

        }
        if(sell==-1)return 0;
        return max;
        
    }
}