class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return Solve(m-1,n-1,dp);
        
    }
    private int Solve(int m,int n,int dp[][]){
        if(m==0 && n==0)
            return 1;
        if(dp[m][n]!=-1)
            return dp[m][n];
        
        int left=0;
        int right=0;
        if(m-1>=0)
            left=Solve(m-1,n,dp);
        if(n-1>=0)
            right=Solve(m,n-1,dp);
        dp[m][n]=left+right;
        return dp[m][n];
    }
}