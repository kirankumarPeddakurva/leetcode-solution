class Solution {
    public int[] twoSum(int[] a, int t) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < a.length; i++) {
            int rem = t - a[i];

            if(hm.containsKey(rem)) {
                return new int[]{hm.get(rem), i};
            }

            hm.put(a[i], i);
        }

        return new int[]{};
    }
}