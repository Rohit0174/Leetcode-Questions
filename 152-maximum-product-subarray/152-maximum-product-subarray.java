class Solution {
    public int maxProduct(int[] nums) {
        int p1=1;
        int max1=nums[0];
        int p2=1;
        int max2=nums[0];
        for(int i=0;i<nums.length;i++){
            p1=p1*nums[i];
            if(p1>max1)
                max1=p1;
            if(p1==0)
                p1=1;
        }
        for(int i=nums.length-1;i>=0;i--){
            p2=p2*nums[i];
            if(p2>max2)
                max2=p2;
            if(p2==0)
                p2=1;
        }
        //System.out.println(p1+" "+p2);
        return Math.max(max1,max2);
        
    }
}