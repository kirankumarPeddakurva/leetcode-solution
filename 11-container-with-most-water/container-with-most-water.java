class Solution {
    public int maxArea(int[] a) 
    {
        int l=0;
        int r=a.length-1;
        int ans=0;
        int water=0;
        while(l<r)
        {
           water=(r-l)*(Math.min(a[r],a[l]));
           ans=Math.max(ans,water);
           if(a[l]<a[r])
           {
            l++;
           }
           else
           {
            r--;
           }
        }
        return ans;
    }
}