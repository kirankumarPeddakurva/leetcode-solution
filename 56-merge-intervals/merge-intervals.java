class Solution {
    public int[][] merge(int[][] a) {
        if(a.length == 1) {
            return a;
        }

        PriorityQueue<int[]> p = new PriorityQueue<>((x, y) -> {
            if(y[0] != x[0]) {
                return x[0] - y[0];
            }
            return x[1] - y[1];
        });

        int n = a.length;

        for(int i = 0; i < n; i++) {
            p.add(new int[]{a[i][0], a[i][1]});
        }

        List<List<Integer>> res = new ArrayList<>();

        int ck[] = p.poll();
        int prevfirst = ck[0];
        int prevsecond = ck[1];

        while(p.size() > 0) {
            int c[] = p.poll();
            int curfirst = c[0];
            int cursecond = c[1];

            if(prevsecond >= curfirst) {
                prevfirst = Math.min(curfirst, prevfirst);
                prevsecond = Math.max(prevsecond, cursecond);
            }
            else {
                List<Integer> all = new ArrayList<>();
                all.add(prevfirst);
                all.add(prevsecond);
                res.add(all);

                prevfirst = curfirst;
                prevsecond = cursecond;
            }
        }

        List<Integer> all = new ArrayList<>();
        all.add(prevfirst);
        all.add(prevsecond);
        res.add(all);

        int size = res.size();
        int ans[][] = new int[size][2];

        int pk = 0;

        for(List<Integer> list : res) {
            ans[pk][0] = list.get(0);
            ans[pk++][1] = list.get(1);
        }

        return ans;
    }
}