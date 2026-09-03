class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.size()>0 && st.peek()==s.charAt(i))
            {
                char re=st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        String res="";
        for(char i:st)
        {
            res=res+String.valueOf(i);
        }
        return res;
    }
}