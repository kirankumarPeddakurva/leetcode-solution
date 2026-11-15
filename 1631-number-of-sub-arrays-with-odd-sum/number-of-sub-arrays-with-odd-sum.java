class Solution {
    public int numOfSubarrays(int[] arr) {
        int s=0;
        int n=arr.length;
        int even=1;
        int odd=0;
        int ans=0;
        for(int i:arr)
        {
            s+=i;
            if(s%2==0)
            {
              ans+=odd;
            even++;
            }
            else
            {
                ans+=even;
                odd++;
            }
            ans=ans%1000000007;
        }
       return ans; 
    }
}