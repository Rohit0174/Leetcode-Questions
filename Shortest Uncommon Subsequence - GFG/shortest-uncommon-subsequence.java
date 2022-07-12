// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A[] = read.readLine().split(" ");
            
            String S = A[0];
            String T = A[1];

            Solution ob = new Solution();
            System.out.println(ob.shortestUnSub(S,T));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Integer[][] dp; 
    static int shortestUnSub(String S, String T) {
       
       dp = new Integer[S.length()][T.length()] ;
       int ans = helper(0,0,S,T) ;
       return ans == 501 ? -1 : ans ;
    }
    
    static int helper(int idx1, int idx2, String s, String t){
        
        if(idx1 == s.length()) return 501 ;
        if(idx2 == t.length()) return 1 ;
        
        if(dp[idx1][idx2] != null) return dp[idx1][idx2] ;
        
        int k = 0 ;
        for( k = idx2 ; k < t.length() ; k++){
            if(t.charAt(k) == s.charAt(idx1)) break;
        }
        
        if(k == t.length() ) return dp[idx1][idx2] =  1 ;  
        
        int np = helper(idx1+1,idx2,s,t) ;
        int p = 1 + helper(idx1+1,k+1,s,t) ;
        
        return dp[idx1][idx2] = Math.min(np,p) ;
    }
};
// b a b h i 
// b a b i j 