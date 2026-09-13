class Solution {
    public int[] nextGreaterElements(int[] a){
        Stack<Integer> st=new Stack<>();
        int n=a.length;
        for(int i=2*n;i>=0;i--)
        {
            int x=a[i%n];
            while(st.size()!=0 && st.peek()<=x)
            {
                st.pop();
            }
            if(i<n)
            {
                a[i]=st.size()==0?-1:st.peek();
            }
            st.push(x);
        }
        return a;
    }
}