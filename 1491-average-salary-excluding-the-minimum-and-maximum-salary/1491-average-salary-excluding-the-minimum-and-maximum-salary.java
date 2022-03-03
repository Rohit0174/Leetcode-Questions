class Solution {
    public double average(int[] nums) {
        int sum=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int num: nums) {
            sum+=num;
            if (min>num) min=num;
            if (max<num) max=num;
        }
        sum=sum-min-max;
        return (double)sum/(nums.length-2);
    }
}