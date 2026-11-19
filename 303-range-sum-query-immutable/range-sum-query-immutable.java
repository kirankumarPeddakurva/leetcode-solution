
class NumArray {
    int[] a;

    public NumArray(int[] nums) {
        int n = nums.length;
        a = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i + 1] = a[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return a[right + 1] - a[left];
    }
}
