class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=1;
        int cnt=1;
       
        while(fast<nums.length){
           
            if(nums[slow]!=nums[fast]){
                nums[slow+1] = nums[fast];
                slow++;
                cnt++;
            }
            fast++;
        }
        return cnt;
    }
}