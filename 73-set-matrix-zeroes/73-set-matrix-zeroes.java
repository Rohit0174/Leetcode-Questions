class Pair{
    int first;
    int second;
    
    public Pair(int first,int second){
        this.first = first;
        this.second = second;

    }
}
class Solution {
    
    public void setZeroes(int[][] matrix) {
       Queue<Pair> queue=new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                    queue.add(new Pair(i,j));
            }
        }
        while(!queue.isEmpty()){
            int first = queue.peek().first;
            int second = queue.peek().second;
            queue.poll();
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[first][i]!=0)
                matrix[first][i]=0;
            }
                
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][second]!=0)
                matrix[i][second]=0;
            }
                
        }
        
    }
}