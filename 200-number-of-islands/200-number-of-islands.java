class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1')
                {
                    DFS(grid,visited,i,j,m,n);
                    cnt++;
                    }
            }
        }
        return cnt;
    }
    private static void DFS(char grid[][],boolean visited[][],int i,int j,int m,int n){
        visited[i][j]=true;
        if(grid[i][j]=='0')return;
        //for left
        if(isValid(i,j-1,m,n) && (!visited[i][j-1] && grid[i][j-1]=='1'))
            DFS(grid,visited,i,j-1,m,n);
        
        //for right
         if(isValid(i,j+1,m,n) && (!visited[i][j+1] && grid[i][j+1]=='1'))
            DFS(grid,visited,i,j+1,m,n);
        
        //for up
          if(isValid(i-1,j,m,n) && (!visited[i-1][j] && grid[i-1][j]=='1'))
            DFS(grid,visited,i-1,j,m,n);
        
        //for down
          if(isValid(i+1,j,m,n) && (!visited[i+1][j] && grid[i+1][j]=='1'))
            DFS(grid,visited,i+1,j,m,n);
}
    private static boolean isValid(int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n)return false;
        return true;
}
}