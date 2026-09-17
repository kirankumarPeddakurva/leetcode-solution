class Solution {
    public String removeKdigits(String s, int k)
     {
    
       Stack<Integer> st=new Stack<>(); 
       int n=s.length();
       if(k>=n)
        {
            return "0";
        }
       for(int i=0;i<n;i++)
       {
        int x=s.charAt(i)-'0';
        while(st.size()>0 && k>0 && st.peek()>x)
        {
            st.pop();
            k--;
        }
        st.push(x);
       }
       while(st.size()>0 && k>0)
       {
        st.pop();
        k--;
       }
       if(st.size()==0)
       {
        return "0";
       }
       String res="";
       while(st.size()>0)
       {
        res=res+String.valueOf(st.pop());
       }
       StringBuilder sb=new StringBuilder(res).reverse();
       String kk=sb.toString().replaceFirst("^0+", "");
       if(kk.length() == 0) return "0";
       return kk;
    }
}