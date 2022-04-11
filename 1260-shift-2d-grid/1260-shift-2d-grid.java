class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
     
        while(k!=0){
            int ans[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==grid.length-1 && j==grid[0].length-1){
                    ans[0][0]=grid[i][j];
                }else if(j==grid[0].length-1){
                    ans[i+1][0]=grid[i][j];
                }else{
                    ans[i][j+1]=grid[i][j];
                }
            }
        }
            grid=ans;
            k--;
    }
    return (List)Arrays.asList(grid);
    }
}