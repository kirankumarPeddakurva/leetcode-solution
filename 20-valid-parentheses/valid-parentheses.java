class Solution {
    public boolean isValid(String s)
     {
        Stack<Character> st=new Stack<>();
        if(s.length()==0 || s.length()%2!=0)
        {
           return false;
        }
        
        for(char i:s.toCharArray())
        {
           if(i=='(' || i=='{'|| i=='[')
           {
            st.push(i);
           }
           else
           {
            if(st.isEmpty())
            {
                return false;
            }
            char x=st.pop();
            if((i==')' && x!='(') || (i==']' && x!='[') || (i=='}' && x!='{'))
            {
                return false;
            }
           } 
        }
        if(st.size()!=0)
          return false;
        return true;
    }
}