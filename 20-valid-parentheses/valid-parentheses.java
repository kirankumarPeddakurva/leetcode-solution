class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='(' || i=='{' || i=='[')
            {
                st.push(i);
            }
            else
            {
            
                if(st.size()==0)
                {
                    return false;
                }
                char x=st.pop();
                if((i=='}'&& x!='{') || (i==')'&& x!='(') || (i==']'&& x!='['))
                {
                    return false;
                }
            }
        }
        if(st.size()!=0)
        {
            return false;
        }
        return true;
    }
}