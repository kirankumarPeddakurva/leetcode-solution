class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> st=new Stack<>();
       int ans=0; 
       for(char i:s.toCharArray())
       {
        if(i=='(')
        {
            st.push(i);
        }
        else
        {
            if(st.size()>0)
            {
                st.pop();
            }
            else
            {
                ans++;
            }
        }
       } 
       return st.size()+ans; 
    }
}