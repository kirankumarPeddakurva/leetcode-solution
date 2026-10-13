class Solution {
    public long maxAlternatingSum(int[] arr) 
    {
        int n=arr.length;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->(b-a));
        for(int i:arr)
        {
            p.add(Math.abs(i));
            q.add(Math.abs(i));
        }
        long ans=0;
        if(n%2!=0)
        {
            int x=q.poll();
            ans+=x*x;
        }
        while(q.size()>n/2)
        {
            int x=q.poll();
            int y=p.poll();
            ans+=(x*x)-(y*y);
        }
        return ans;
    }
}