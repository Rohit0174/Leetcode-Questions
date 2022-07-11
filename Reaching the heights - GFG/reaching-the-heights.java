// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.reaching_height(N, arr);
        	
        	if(ans.size() == 1 && ans.get(0) == -1){
        	    System.out.println("Not Possible");
        	    continue;
        	}
        	
        	for(int i: ans)
        	    System.out.print(i + " ");
        	System.out.println();
		}
	}
}






// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> reaching_height (int n, int arr[]) {
        //Complete the function
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(arr);
        int sum1=0,sum2=0;
        int j=n%2==0?n/2-1:n/2;
        int i=0,k=0,m=0;
        while(i<n){
            if(i%2==0) {
                l.add(arr[n-1-k]);
                sum1+=arr[n-1-k];
                k++;
            }
            else {
                l.add(arr[m]);
                sum2+=arr[m];
                m++;
                // j--;
            }
            i++;
        }
        if(sum1==sum2){
            l.clear();
            l.add(-1);
        }
        return l;
    }
}
