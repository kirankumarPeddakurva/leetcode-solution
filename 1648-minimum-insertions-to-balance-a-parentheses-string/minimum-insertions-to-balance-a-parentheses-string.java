
class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);

            if (x == '(') {
                st.push(x);
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    ans++;
                }

                if (st.size() > 0) {
                    st.pop();
                } else {
                    ans++;
                }
            }
        }

        return ans + st.size() * 2;
    }
}
