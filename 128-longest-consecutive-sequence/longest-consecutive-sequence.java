class Solution {
    public int longestConsecutive(int[] res)
     {
        HashSet<Integer> set=new HashSet<>();
        for(int i:res)
        {
            set.add(i);
        }
        int a[]=new int[set.size()];
         int p=0;
         for(int i:set)
         {
            a[p++]=i;
         }
         Arrays.sort(a);
        int ans=0;
        int c=1;
        int n=a.length;
        if(n==0 || n==1)
        {
            return n;
        }
        for(int i=1;i<n;i++)
        {
            if(a[i-1]==a[i]-1)
            {
                c++;
                 ans=Math.max(ans,c);
            }
            else
            {
                 c=1;
            }
        }
         ans=Math.max(ans,c);
         return ans;
    }
}