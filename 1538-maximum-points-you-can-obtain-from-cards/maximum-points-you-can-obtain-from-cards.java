class Solution {
    public int maxScore(int[] a, int k){
        
        int n=a.length;
        int ls=0;
        int l=0;
        int ans=Integer.MIN_VALUE;
        while(l<k)
        {
            ls+=a[l++];
        }
        ans=Math.max(ls,ans);
        int r=n-1;
        for(int i=k-1;i>=0;i--)
        {
            ls-=a[i];
            ls+=a[r--];
            ans=Math.max(ls,ans);
        }
        return ans;
       
    }
}