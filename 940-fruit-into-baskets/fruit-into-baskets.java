class Solution {
    public int totalFruit(int[] a) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        int n=a.length;
        int l=0;
        for(int i=0;i<n;i++)
        {
            
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            while(hm.size()>2)
            {
                hm.put(a[l],hm.get(a[l])-1);
                if(hm.get(a[l])==0)
                {
                     hm.remove(a[l]);
                }
                l++;
            }
            ans=Math.max(i-l+1,ans);
        }
        return ans;
    }
}