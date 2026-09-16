class Solution {
    public static void prev(int pse[],int n,int a[])
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(st.size()>0 && a[st.peek()]>a[i])
            {
                st.pop();
            }
            pse[i]=st.size()==0?-1:st.peek();
            st.push(i);
        }

    }
    public static void next(int nse[],int n,int a[])
    {
         Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()>0 && a[st.peek()]>=a[i])
            {
                st.pop();
            }
            nse[i]=st.size()==0?n:st.peek();
            st.push(i);
        }
    }
    public int largestRectangleArea(int[] a) 
    {
        int n=a.length;
        int nse[]=new int[n];
        int pse[]=new int[n];
        prev(pse,n,a);
        next(nse,n,a);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,a[i]*(nse[i]-pse[i]-1));
        }
        return ans;
    }
}