class Solution {
    public int subarraySum(int[] a, int k) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int s=0;
        int c=0;
          for(int i:a)
          {
             s+=i;
             if(hm.containsKey(s-k))
             {
                c+=hm.get(s-k);
             }
             hm.put(s,hm.getOrDefault(s,0)+1);
          }
          return c;
    }
}