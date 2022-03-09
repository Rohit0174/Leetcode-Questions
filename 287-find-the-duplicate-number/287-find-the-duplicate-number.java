class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate=0;
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])]<0)
               { duplicate =  nums[i];
               break;}
            else{
                nums[Math.abs(nums[i])]*=-1;
            }
        }
        return Math.abs(duplicate);
    }
}