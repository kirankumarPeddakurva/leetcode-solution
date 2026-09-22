class Solution {
    public boolean search(int[] a, int t)
     {
        HashSet<Integer> set=new HashSet<>();
        for(int i:a)
        {
             set.add(i);
        }
         if(set.contains(t))
             return true;
      return false;  
    }
}