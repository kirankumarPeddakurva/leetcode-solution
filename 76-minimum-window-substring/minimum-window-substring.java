
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        for (char c : t.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> h2 = new HashMap<>();
        int n = s.length();
        int l = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            h2.put(x, h2.getOrDefault(x, 0) + 1);

            while (containsAll(h1, h2)) {
                if (i - l + 1 < min) {
                    min = i - l + 1;
                    start = l;
                }

                char y = s.charAt(l);
                h2.put(y, h2.get(y) - 1);
                if (h2.get(y) == 0) {
                    h2.remove(y);
                }
                l++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }

    public boolean containsAll(HashMap<Character, Integer> h1,
                               HashMap<Character, Integer> h2) {
        for (char c : h1.keySet()) {
            if (h2.getOrDefault(c, 0) < h1.get(c)) {
                return false;
            }
        }
        return true;
    }
}
