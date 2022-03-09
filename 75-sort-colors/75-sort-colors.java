class Solution {
    public void sortColors(int[] arr) {
        int k=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                swap(arr,i,j);
                j--;

            }else{
                if(i==k)
                {
                    i++;
                    k++;
                }else
               { swap(arr,i,k);
                k++;}
            }
        }
    }
    private void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}