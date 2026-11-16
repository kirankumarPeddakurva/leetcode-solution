class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        HashSet<List<Integer>> res = new HashSet<>();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int k = -(a[i] + a[j]);

                if (set.contains(k)) {
                    List<Integer> all = new ArrayList<>();

                    all.add(a[i]);
                    all.add(a[j]);
                    all.add(k);

                    Collections.sort(all);
                    res.add(all);
                }

                set.add(a[j]);
            }
        }

        return new ArrayList<>(res);
    }
}