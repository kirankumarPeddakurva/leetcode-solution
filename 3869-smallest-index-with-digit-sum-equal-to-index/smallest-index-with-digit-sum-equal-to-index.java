class Solution {
    public int smallestIndex(int[] a)
     {
        int n=a.length;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
           int s=0;
             while(a[i]>0)
             {
               s+=a[i]%10;
                 a[i]=a[i]/10;
             }
             if(s==i)
             {
               ans=i;
               break;
             }
        }
        return ans;
    }
}