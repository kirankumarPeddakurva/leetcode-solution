class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int n=s.length();
        if(n<=1)
        {
            return n;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                 l++;
            }
            set.add(s.charAt(i));
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}