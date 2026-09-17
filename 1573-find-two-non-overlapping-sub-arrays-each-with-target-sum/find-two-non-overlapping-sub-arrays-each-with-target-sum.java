class Solution {
    public int minSumOfLengths(int[] a, int t)
     {
         int n = a.length;
        int ans = Integer.MAX_VALUE;

        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += a[right];

            while (sum > t) {
                sum -= a[left];
                left++;
            }

            if (sum == t) {
                int len = right - left + 1;

                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[left - 1]);
                }

                min = Math.min(min, len);
            }

            best[right] = min;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}