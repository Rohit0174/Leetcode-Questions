class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max = nums[0];
        for(Integer num:nums){
            sum=sum+num;
            if(sum>max)max=sum;
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}