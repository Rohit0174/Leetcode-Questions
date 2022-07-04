class Solution {
    public int candy(int[] arr) {
       int ans[]=new int[arr.length];
        Arrays.fill(ans,1);
        
        //traversing left
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]>arr[i-1])
                ans[i]=ans[i-1]+1;
        }
        //traversing right
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1] && ans[i]<=ans[i+1])
                ans[i]=ans[i+1]+1;
        }
        int sum=0;
        for(int i=0;i<ans.length;i++)
            sum=sum+ans[i];
        return sum;
    }
}