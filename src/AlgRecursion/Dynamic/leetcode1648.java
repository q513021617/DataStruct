package AlgRecursion.Dynamic;

public class leetcode1648 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] hash = new boolean[26];
        for (char c : allowed.toCharArray()) hash[c - 'a'] = true;
        int ans = 0;

        for (String s : words) {
            boolean iserr=false;
            for (char c : s.toCharArray()) {
                if (!hash[c - 'a']) {
                    iserr=true;
                    break;
                }
            }
            if(!iserr){
                ans++;
            }
        }
        return ans;
    }
}
