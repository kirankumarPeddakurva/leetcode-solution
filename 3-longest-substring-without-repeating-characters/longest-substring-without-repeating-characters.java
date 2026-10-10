class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n=s.length();
        if(n<=1)
        {
            return n;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            char x=s.charAt(i);
            if(hm.containsKey(x))
            {
                l=Math.max(l,hm.get(x)+1);
            }
            ans=Math.max(ans,i-l+1);
              hm.put(x,i);
        }
        return ans;
    }
}