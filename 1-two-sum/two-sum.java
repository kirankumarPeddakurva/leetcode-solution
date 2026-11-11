class Solution {
    public int[] twoSum(int[] a, int t) {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]+a[j]==t && i!=j)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}