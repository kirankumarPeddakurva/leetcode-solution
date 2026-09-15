class Solution {
    public static void prevs(int pse[],int a[],int n)
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
    public static void nexts(int nse[],int a[],int n)
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
    public static void prevgr(int pge[],int a[],int n)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(st.size()!=0 && a[st.peek()]<a[i])
            {
                st.pop();
            }
            pge[i]=st.size()==0?-1:st.peek();
            st.push(i);
        }
    }
    public static void nextgr(int nge[],int a[],int n)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
           while(st.size()!=0 && a[st.peek()]<=a[i])
           {
            st.pop();
           }
           nge[i]=st.size()==0?n:st.peek();
           st.push(i);
        }
    }
    public long subArrayRanges(int[] a) 
    {
     int n=a.length;
     int pse[]=new int[n];
     int nse[]=new int[n];
     prevs(pse,a,n);
     nexts(nse,a,n);
     long st=0;
     for(int i=0;i<n;i++)
     {
        long l=i-pse[i];
        long r=nse[i]-i;
        st+=(l*r*a[i]);
     } 
     int pge[]=new int[n];
     int nge[]=new int[n];
     prevgr(pge,a,n); 
     nextgr(nge,a,n); 
     long lt=0;
     for(int i=0;i<n;i++)
     {
        long l=i-pge[i];
        long r=nge[i]-i;
        lt+=l*r*a[i];
     }
     return lt-st;
    }
}