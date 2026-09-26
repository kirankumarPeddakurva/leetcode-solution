class Solution {
    public int singleNonDuplicate(int[] a)
     {
        int n=a.length;
        if(n==1)
        {
            return a[0];
        }
        
        int l=1;
        int r=n-2;
        if(a[l]!=a[0])
        {
            return a[0]; 
        }
        if(a[r]!=a[n-1])
        {
            return a[n-1];
        }
        while(l<=r)
        {
            int m=(l+r)/2;
            if(a[m]!=a[m-1] && a[m]!=a[m+1])
            {
                return a[m];
            }
            if(m%2==0)
            {
                if(a[m]==a[m-1])
                {
                    r=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            else
            {
                if(a[m]==a[m-1])
                {
                    l=m+1;
                }
                else
                {
                    r=m-1;
                }
            }

        }
        return -1; 
    }
}