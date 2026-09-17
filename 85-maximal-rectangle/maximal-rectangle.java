class Solution {
    public static void prevsmall(int pse[],int n,int a[])
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
    public static void nextsmall(int nse[],int n,int a[])
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
    public static int Largest(int p[],int n)
    {
        int pse[]=new int [n];
        int nse[]=new int[n];
        prevsmall(pse,n,p);
        nextsmall(nse,n,p);
        int ans=0;
        for(int i=0;i<n;i++)
        {
           ans=Math.max(ans,(nse[i]-pse[i]-1)*p[i]);
        }
        return ans;
    }
    public int maximalRectangle(char[][] a)
     {
      int n=a.length;
      int m=a[0].length;
      int p[]=new int[m];
      int ans=0;
      for(int i=0;i<n;i++)
      {
        
        for(int j=0;j<m;j++)
        {
            if(a[i][j]=='1')
            {
                p[j]++;
                
            }
            else
            {
              p[j]=0;
            }
            
        }
        ans=Math.max(ans,Largest(p,m));
      }  
     
     return ans;
    }
}