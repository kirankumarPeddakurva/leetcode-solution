class Solution {
    public int firstStableIndex(int[] a, int k) {
       
        int n=a.length;
        int ans=-1;
        int ml=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
             int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++)
            {
                max=Math.max(a[j],max);
            }
            for(int l=i;l<n;l++)
            {
                min=Math.min(a[l],min);
            }
             if (max - min <= k) 
             {
             int diff = max - min;
            if (diff < ml) 
            {
               return i; 
            }
         }
        }
        return -1;
    }
}