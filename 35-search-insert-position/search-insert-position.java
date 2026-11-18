class Solution {
    public int searchInsert(int[] a, int t) {
        int n=a.length;
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(a[m]<=t)
            {
                ans=m;
            }
            if(a[m]<t)
            {
              l=m+1;
            }
            else
            {
                h=m-1;
            }
        }
          if(ans == -1)
            return 0;

        if(a[ans] == t)
            return ans;

        return ans+1;
    }
}