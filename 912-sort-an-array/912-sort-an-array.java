class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1)
            return nums;
        MergeSort(nums);
        return nums;
    }
    public static void MergeSort(int arr[]){
        if(arr.length<=1)
            return;
       
        int b[]=new int[arr.length/2];
        int c[]=new int[arr.length-b.length];
        for(int i=0;i<b.length;i++)
            b[i]=arr[i];
        
        for(int i=arr.length/2;i<arr.length;i++)
            c[i-arr.length/2]=arr[i];
        MergeSort(b);
        MergeSort(c);
        merge(b,c,arr);
        
    }
    public static void merge(int b[],int c[],int arr[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<b.length && j<c.length){
            if(b[i]<=c[j]){
                arr[k]=b[i];
                k++;
                i++;
            }
            else{
                arr[k]=c[j];
                k++;
                j++;
            }
        }
        while(i<b.length){
            arr[k]=b[i];
            i++;
            k++;
        }
        while(j<c.length){
            arr[k]=c[j];
            j++;
            k++;
        }
    }
}






