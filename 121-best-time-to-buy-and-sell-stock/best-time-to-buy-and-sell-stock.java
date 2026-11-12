class Solution {
    public int maxProfit(int[] a) {
     int n=a.length;
      int min=a[0];
       int max=0;
       for(int i=1;i<n;i++)
       {
        if(a[i]<min)
        {
            min=a[i];

        }
        else
        {
            max=Math.max(max,a[i]-min);
        }
       } 
       return max;
    }
}