class Solution {
    public int longestMonotonicSubarray(int[] a) 
    {
        int n=a.length;
        int c=1;
        int ans=-99;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            {
                c++;
            }
            else
            {
                ans=Math.max(ans,c);
                c=1;
            }
        }
         ans=Math.max(ans,c);
         c=1;
         for(int i=1;i<n;i++)
         {
            if(a[i]<a[i-1])
            {
                c++;
            }
            else
            {
                ans=Math.max(ans,c);
                c=1;
            }
         }
          ans=Math.max(ans,c);
          return ans;
    }
}