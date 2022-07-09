// { Driver Code Starts
import java.util.Scanner;
import java.io.*;
class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class GFG2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node start1=null,cur1=null,start2=null,cur2=null;
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start1==null)
                {
                    start1=ptr;
                    cur1=ptr;
                }
                else{
                    cur1.next=ptr;
                    cur1=ptr;
                }
            }
            n=sc.nextInt();
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start2==null)
                {
                    start2=ptr;
                    cur2=ptr;
                }
                else{
                    cur2.next=ptr;
                    cur2=ptr;
                }
            }
            Solution obj=new Solution();
            Node sum = obj.addPolynomial(start1,start2);
            for(Node ptr=sum ; ptr != null; ptr=ptr.next  )
            {
                // printing polynomial
                System.out.print(ptr.coeff + "x^" + ptr.pow);
                if(ptr.next != null)
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

//Print the polynomial formed by adding both LL in the function itself.
class Solution
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        Node P1 = p1, P2 = p2, answer = null, current = null;
        
        if(P1.pow == P2.pow){
            answer = new Node(P1.coeff + P2.coeff, P1.pow);
            current = answer;
            P1 = P1.next;
            P2 = P2.next;
        }else if(P1.pow > P2.pow){
            answer = new Node(P1.coeff, P1.pow);
            current = answer;
            P1 = P1.next;
        }else{
            answer = new Node(P2.coeff, P2.pow);
            current = answer;
            P2 = P2.next;
        }
        
        while(P1 != null && P2 != null){
            if(P1.pow == P2.pow){
                current.next = new Node(P1.coeff + P2.coeff, P1.pow);
                current = current.next;
                P1 = P1.next;
                P2 = P2.next;
            }else if(P1.pow > P2.pow){
                current.next = new Node(P1.coeff, P1.pow);
                current = current.next;
                P1 = P1.next;
            }else{
                current.next = new Node(P2.coeff, P2.pow);
                current = current.next;
                P2 = P2.next;
            }
        }
        
        // System.out.println("hello");
        
        if(P2 == null){
            current.next = P1;
            // System.out.println("hello");
        }else if(P1 == null){
            current.next = P2;
        }
        
        return answer;
    }
}