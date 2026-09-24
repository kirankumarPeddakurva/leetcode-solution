class Solution {
    public static int first(int a[],int n,int t,int ft)
    {
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==t)
            {
                ft=m;
                h=m-1;
            }
            else if(a[m]>t)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return ft;
    }

    public static int last(int a[],int n,int t,int lt)
    {
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==t)
            {
                lt=m;
                l=m+1;
            }
            else if(a[m]>t)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return lt;
    }

    public int[] searchRange(int[] a, int t) 
    {
        int n=a.length; 
        int s1=first(a,n,t,-1);
         int s2=last(a,n,t,-1);
         return new int[]{s1,s2};
    }
}