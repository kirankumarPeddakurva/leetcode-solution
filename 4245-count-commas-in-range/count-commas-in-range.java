class Solution {
    public int countCommas(int n) 
    {
     
     int ans=0;
     if(n<=999)
     {
        return 0;
     }
        ans+=(n/1000-1)*1000+(n%1000);
     return ans+1;
    }
}