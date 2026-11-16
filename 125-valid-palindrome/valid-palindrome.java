class Solution {
    public boolean isPalindrome(String s) 
    {

       
        StringBuilder sb=new StringBuilder();
        for( char i:s.toCharArray())
        {
            if(Character.isLetterOrDigit(i))
            {
                sb.append(Character.toLowerCase(i));
            }
        }
        String sk=sb.toString();
        sb.reverse();

        String rev=sb.toString();
        
        return rev.equals(sk);
    }
}