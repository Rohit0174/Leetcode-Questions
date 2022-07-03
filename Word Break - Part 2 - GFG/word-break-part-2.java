// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<String> wordBreak(int n, List<String> B, String A){
        List<String> res = new ArrayList<>();
        f(0, "", A, B, res);
        return res;
    }
    
    static void f(int index, String s, String A, List<String> B, List<String> res){
        if(index==A.length()){
            res.add(s.substring(0, s.length()-1));
            return;
        }
        
        for(int i=index;i<A.length();i++){
            if(isValid(index, i, A, B)){
                f(i+1, s+A.substring(index,i+1)+ " ", A, B, res);
            }
        }
    }
    
    static boolean isValid(int i, int j, String A, List<String> B){
        return B.contains(A.substring(i,j+1));
    }
}