class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list=new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int left = 0;
        int right = m-1;
        int top = 0;
        int down = n-1;
        while(left<=right && top<=down){
            
            //traversing right
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            if(left>right || top>down)break;
            
            //traversing down
            for(int i=top;i<=down;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(left>right || top>down)break;
            
            //traversing left
            for(int i=right;i>=left;i--){
                list.add(arr[down][i]);
            }
            down--;
            if(left>right || top>down)break;
            
            //traversing up
            for(int i=down;i>=top;i--){
                list.add(arr[i][left]);
            }
            left++;
            if(left>right || top>down)break;
        }
        return list;
    }
}