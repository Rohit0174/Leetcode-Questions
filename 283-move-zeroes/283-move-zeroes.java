class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]==0){
                i++;
            }
            else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
                i++;
            }
        }
    }
}