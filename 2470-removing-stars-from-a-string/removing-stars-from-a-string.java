class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='*')
            {
                st.pop();
            }
            else
            {
                st.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:st)
        {
            sb.append(i);
        }
        
        String res=sb.toString();
        return res;
    }
}