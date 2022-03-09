class Solution {
    public int majorityElement(int[] nums) {
        int majority_element=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                majority_element=nums[i];
                count++;
            }
           else if(majority_element==nums[i])
                count++;
            
            else
                count--;
        }
        return majority_element;
    }
}