// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minVal(a, b));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    static int getSetBitCount(int a){
        int count = 0;
        for (int i = 0; i<32; i++){
            if (((1<<i)&a)!=0){
                count++;
            }
        }
        return count;
    }
    
    static int getX(int a, int count){
        int res = 0;
        for (int i = 31; i>=0&&count>0; i--){
            if (((1<<i)&a)!=0){
                res = res|(1<<i);
                count--;
            }
        }
        return res;
    }
    
    static int extra(int a, int count){
        for (int i = 0; i<32&&count>0; i++){
            if (((1<<i)&a)==0){
                a = a^(1<<i);
                // System.out.println("A: "+a);
                count--;
            }
        }
        return a;
    }
    
    public static int minVal(int a, int b) {
        int setBitCount = getSetBitCount(b);
        
        int aCount = getSetBitCount(a);
        int x;
        if (aCount<setBitCount){
            x = extra(a,setBitCount-aCount);
        }
        else {
            x = getX(a,setBitCount);
        }
        
        return x;
        
    }
}