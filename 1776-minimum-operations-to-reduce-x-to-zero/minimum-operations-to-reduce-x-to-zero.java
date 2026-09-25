class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;

        for (int a : nums)
            total += a;

        int target = total - x;

        if (target < 0)
            return -1;

        if (target == 0)
            return n;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int max = -1;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (map.containsKey(sum - target)) {
                int j = map.get(sum - target);
                max = Math.max(max, i - j);
            }

            map.put(sum, i);
        }

        if (max == -1)
            return -1;

        return n - max;
    }
}