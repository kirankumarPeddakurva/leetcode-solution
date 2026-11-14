class Solution {
    public int minimumSumSubarray(List<Integer> all, int l, int r) {
        int n=all.size();
        int min=Integer.MAX_VALUE;

        for (int i=0;i<n;i++) {
            int s=0;

            for (int j=i;j<n && j<i+r;j++) {
                s+=all.get(j);

                int len=j-i+1;

                if (len>=l && s>0) {
                    min=Math.min(min, s);
                }
            }
        }

        return min==Integer.MAX_VALUE?-1:min;
    }
}