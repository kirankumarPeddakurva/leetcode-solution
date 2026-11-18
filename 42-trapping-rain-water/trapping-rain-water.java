class Solution {
    public int trap(int[] a) 
    {
    
    int n=a.length;
    int pr[]=new int[n];
    int sf[]=new int[n];
    pr[0]=a[0];
    sf[n-1]=a[n-1];
    for(int i=1;i<n;i++)
    {
        pr[i]=Math.max(pr[i-1],a[i]);
        
    }
    for(int i=n-2;i>=0;i--)
    {
        sf[i]=Math.max(sf[i+1],a[i]);
    }
    int water=0;
    for(int i=0;i<n;i++)
    {
        water+=Math.min( pr[i],sf[i])-a[i];
    }
    return water;
    }
}