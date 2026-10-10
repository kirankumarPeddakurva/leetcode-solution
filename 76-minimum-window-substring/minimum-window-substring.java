
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char i:t.toCharArray())
        {
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        HashMap<Character,Integer> h2=new HashMap<>();
        int l=0;
        int n=s.length();
        int min=Integer.MAX_VALUE;
        int st=0;
        for(int i=0;i<n;i++)
        {
            char x=s.charAt(i);
            h2.put(x,h2.getOrDefault(x,0)+1);
            while(containsAll(h1,h2))
            {
              if(i-l+1<min)
              {
                min=i-l+1;
                st=l;
              }
              char y=s.charAt(l);
              h2.put(y,h2.get(y)-1);
              if(h2.get(y)==0)
              {
                h2.remove(y);
              }
              l++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(st,min+st);
    }
    public static boolean containsAll(HashMap<Character,Integer> h1,HashMap<Character,Integer> h2)
    {
        for(char i:h1.keySet())
        {
            if(h2.getOrDefault(i,0)<h1.get(i))
            {
                return false;
            }
        }
        return true;
    }
}
