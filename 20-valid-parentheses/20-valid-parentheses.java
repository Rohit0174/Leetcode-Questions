class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[')
                stack.push(']');
            
            else if(s.charAt(i)=='(')
                stack.push(')');
            
            else if(s.charAt(i)=='{')
                stack.push('}');
            
            else
            {
                if( stack.isEmpty() || stack.peek()!=s.charAt(i))
                    return false;
                else{
                    stack.pop();
                }
            }
            
        }
        if(stack.isEmpty())
        return true;
        return false;
    }
}