
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder ans = new StringBuilder();
        StringBuilder a = new StringBuilder();

        int i = 0, count = 1;
        int n = sentence.length();

        while (i < n) {
            int j = i;

            while (j < n && sentence.charAt(j) != ' ') {
                j++;
            }

            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans.append(sentence, i, j);
            } else {
                ans.append(sentence, i + 1, j);
                ans.append(sentence.charAt(i));
            }

            ans.append("ma");
            a.append('a');
            ans.append(a);

            if (j < n) {
                ans.append(' ');
            }

            i = j + 1;
            count++;
        }

        return ans.toString();
    }
}
