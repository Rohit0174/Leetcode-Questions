class Solution {
    public int maxArea(int[] arr) {
        int ans=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int min = Math.min(arr[i],arr[j]);
            int length = j-i;
            ans=Math.max(ans,min*length);
            if(arr[i]<arr[j])i++;
            else
                j--;
        }
        return ans;
    }
}