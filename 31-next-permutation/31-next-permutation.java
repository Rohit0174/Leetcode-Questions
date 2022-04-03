class Solution {
    public void nextPermutation(int[] nums) {
        int start=nums.length-2;
        int m=nums.length-1;
        while(start>=0){
            if(nums[start]<nums[m]){
                break;
            }
            m=start;
            start--;
        }
        if(start<0){
            int i=0;
            int j=nums.length-1;
            while(i<j){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j--;
            }
            return;
        }
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=start;i<nums.length;i++){
            if(nums[i]>nums[start] && nums[i]<=min){
                min=nums[i];
                index=i;
            }
        }
        
        
        
        int temp=nums[index];
        nums[index]=nums[start];
        nums[start]=temp;
         int i=start+1;
    int j=nums.length-1;
    while(i<j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        i++;
        j--;
    }
    }
   
}