class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
       // int k=1;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         arr[i][j]=k;
        //         k++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int right=n-1;
        int top=0;
        int down=n-1;
        int l=1;
        while(left<=right ){
            for(int i=left;i<=right;i++){
            arr[top][i]=l++;
            }
            top++;
            
            for(int i=top;i<=down;i++){
                arr[i][right]=l++;
            }
            right--;
            
            for(int i=right;i>=left;i--){
                arr[down][i]=l++;
            }
            down--;
            
            for(int i=down;i>=top;i--){
                arr[i][left]=l++;
            }
            left++;
        }
        // int l=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         arr[i][j]=list.get(l++);
        //     }
        // }
        return arr;
    }
}