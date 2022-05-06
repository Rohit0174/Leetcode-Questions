class Pair{
    char ch;
    int count;
    public Pair(char ch,int count){
        this.ch = ch;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(stack.isEmpty()){
                stack.push(new Pair(s.charAt(i),1));
            }else if(stack.peek().ch==s.charAt(i)){
                int value = stack.peek().count;
                value++;
                stack.push(new Pair(s.charAt(i),value));
                if(value == k){
                    while(value!=0){
                        stack.pop();
                        value--;
                    }
                }
                
            }else{
                stack.push(new Pair(s.charAt(i),1));
            }
            i++;
        }
        String str = "";
        while(!stack.isEmpty()){
            str=str+stack.peek().ch;
            stack.pop();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}