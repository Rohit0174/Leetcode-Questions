class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        int i=0;
        for(int index=0;index<arr.length;index+=2){
            arr[index] = nums[i++];
        }
        for(int index=1;index<arr.length;index+=2){
            arr[index] = nums[i++];
        }
        return arr;
    }
}