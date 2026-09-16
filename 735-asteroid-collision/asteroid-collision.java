class Solution {
    public int[] asteroidCollision(int[] a) 
    {
        int n=a.length;
        Stack<Integer> st=new Stack<>();
         for(int i=0;i<n;i++)
         {
            if(a[i]>0)
            {
                st.push(a[i]);
            }
            else
            {
                while(st.size()>0 && st.peek()>0 && st.peek()<Math.abs(a[i]))
                {
                    st.pop();
                }
                if(st.size()>0 && st.peek()==Math.abs(a[i]))
                {
                    st.pop();
                }
                else if(st.size()==0 || st.peek()<Math.abs(a[i]))
                {
                    st.push(a[i]);
                }
            }
         }
         int res[]=new int[st.size()];
         int p=st.size()-1;
         while(st.size()>0)
         {
            res[p--]=st.pop();
         }
         return res;
    }
}