class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
       int s=0;
       while(n!=1)
       {
           if(set.contains(n))
           {
            return false;
           } 
           set.add(n);
           s=0;
            while(n>0)
            {
                int r=n%10;
                s+=r*r;
                n=n/10;
            }
            n=s;

       } 
       return true;
    }
}