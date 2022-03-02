class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
           return false;
        
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        int i=0;
        int j=0;
       // System.out.println(new String(ch)+" "+new String(ch1));
        while(i<ch.length ){
            if(ch[i]!=ch1[j])
                return false;
            i++;
            j++;
        }
        return true;
    }
}