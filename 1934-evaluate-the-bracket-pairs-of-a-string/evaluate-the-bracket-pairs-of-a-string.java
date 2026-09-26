class Solution {
    public String evaluate(String s, List<List<String>> res) {
        HashMap<String,String> hm = new HashMap<>();

        for(List<String> all : res) {
            hm.put(all.get(0), all.get(1));
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length();) {
            if(s.charAt(i) == '(') {
                int j = s.indexOf(')', i);
                String key = s.substring(i + 1, j);

                if(hm.containsKey(key)) {
                    ans.append(hm.get(key));
                } else {
                    ans.append("?");
                }

                i = j + 1;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }
}