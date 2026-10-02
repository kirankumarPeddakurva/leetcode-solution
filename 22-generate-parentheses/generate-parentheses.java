class Solution {
    public static void max(String s,int n,int op,int cl,List<String> all)
    {
        if(s.length()==2*n)
        {
            all.add(s);
            return;
        }
        if(op<n)
        max(s+'(',n,op+1,cl,all);
        if(cl<op)
        {
            max(s+')',n,op,cl+1,all);
        }
    }
    public List<String> generateParenthesis(int n) 
    {
        List<String> all=new ArrayList<>();
        String s="";
        max(s,n,0,0,all);
         return all;
    }
}