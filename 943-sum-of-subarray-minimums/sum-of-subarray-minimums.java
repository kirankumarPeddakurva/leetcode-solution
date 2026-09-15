class Solution {
    public static void previous(int a[],int pse[],int n)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(st.size()!=0 && a[st.peek()]>a[i])
            {
                st.pop();
            }
            pse[i]=st.size()==0?-1:st.peek();
            st.push(i);
        }
    }
      public static void next(int a[],int nse[],int n)
      {
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()!=0 && a[st.peek()]>=a[i])
            {
                st.pop();
            }
        
        nse[i]=st.size()==0?n:st.peek();
        st.push(i);
        }
      }
    public int sumSubarrayMins(int[] a)
     {
        int mod=(int)1e9+7;
        int n=a.length;
        int pse[]=new int[n];
        int nse[]=new int[n];
        previous(a,pse,n);
        next(a,nse,n);
        long ans=0;
        for(int i=0;i<n;i++)
        {
            long l=i-pse[i];
            long r=nse[i]-i;
            ans+=(((l*r)%mod)*a[i])%mod;
            ans=ans%mod;
        }
        return (int)ans;
    }
}