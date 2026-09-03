class Solution {
    public boolean uniformArray(int[] a)
     {
       int min = Integer.MAX_VALUE;

        for (int x : a) {
            min = Math.min(min, x);
        }

        if (min % 2 == 1) {
            return true;
        }

        for (int x : a) {
            if (x % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}