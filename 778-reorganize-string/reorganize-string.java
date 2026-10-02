class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char i : s.toCharArray()) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> p =
            new PriorityQueue<>((x, y) -> y[1] - x[1]);

        for(char i : hm.keySet()) {
            p.add(new int[]{i, hm.get(i)});
        }

        String res = "";

        while(!p.isEmpty()) {
            int a[] = p.poll();
            char ch = (char)a[0];
            int fr = a[1];

            if(res.isEmpty() || res.charAt(res.length() - 1) != ch) {
                res += ch;

                if(fr > 1) {
                    p.add(new int[]{ch, fr - 1});
                }
            }
            else {
                if(p.isEmpty()) {
                    return "";
                }

                int b[] = p.poll();
                char ch2 = (char)b[0];
                int fr2 = b[1];

                res += ch2;

                if(fr2 > 1) {
                    p.add(new int[]{ch2, fr2 - 1});
                }

                p.add(new int[]{ch, fr});
            }
        }

        return res;
    }
}