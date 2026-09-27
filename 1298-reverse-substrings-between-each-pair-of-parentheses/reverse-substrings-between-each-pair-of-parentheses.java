class Solution {
    public String reverseParentheses(String s)
     {
        Stack<String> st=new Stack<>();
        String cur = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(cur);
                cur = "";
            }
            else if (c == ')') {
                StringBuilder sb = new StringBuilder(cur);
                cur = st.pop() + sb.reverse().toString();
            }
            else {
                cur += c;
            }
        }

        return cur;
    }
}