class Solution {
    public int maxDepth(String s) 
    {
        int max=0;
        Stack<Character> st=new Stack<>(); 
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push('(');
                max=Math.max(max,st.size());
            }
            else if(s.charAt(i)==')'){
                if(st.size()>0)
                {
                    st.pop();
                }
            }

        }
         max=Math.max(max,st.size());
         return max;
    }
}