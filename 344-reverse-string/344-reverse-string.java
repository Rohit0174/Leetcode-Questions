class Solution {
    public void reverseString(char[] s) {
        Solve(s,0);
    }
    private void Solve(char s[],int index){
        if(index==s.length)
            return;
        char ch = s[index];
        Solve(s,index+1);
        s[s.length-1-index]=ch;
    }
}