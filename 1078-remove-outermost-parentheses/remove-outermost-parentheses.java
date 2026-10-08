class Solution {
    public String removeOuterParentheses(String s) 
    {
        Stack<Character> st=new Stack<>();
        String res="";
        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                 if (st.size() > 0) {
                    res = res + i;
                }
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.size()>0)
                {
                    
                    res=res+i;

                }
                
            }
        } 
        return res;
    }
}