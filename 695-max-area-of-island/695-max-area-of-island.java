class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean visited[][] = new boolean[rows][cols];
            
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(grid[row][col]==1&&!visited[row][col]){
                    int currArea = bfs(grid,visited,row,col,rows,cols);
                    maxArea = Math.max(maxArea,currArea);
                }
            }
        }
        
        return maxArea;
    }
    
    private int bfs(int grid[][],boolean visited[][],int row,int col,int rows,int cols){
        Queue<int[]> queue = new ArrayDeque();
        queue.add(new int[]{row,col});
        int currArea = 0;
        
        while(queue.size()>0){
            int arr[] = queue.remove();
            row = arr[0];
            col = arr[1];
            
            if(visited[row][col]) continue;
            
            visited[row][col] = true;
            currArea++;
            
            if(row-1>=0&&grid[row-1][col]==1&&!visited[row-1][col]){
                queue.add(new int[]{row-1,col});
            }
            if(row+1<rows&&grid[row+1][col]==1&&!visited[row+1][col]){
                queue.add(new int[]{row+1,col});
            }
            if(col-1>=0&&grid[row][col-1]==1&&!visited[row][col-1]){
                queue.add(new int[]{row,col-1});
            }
            if(col+1<cols&&grid[row][col+1]==1&&!visited[row][col+1]){
                queue.add(new int[]{row,col+1});
            }
        }
        
        return currArea;
    }
}