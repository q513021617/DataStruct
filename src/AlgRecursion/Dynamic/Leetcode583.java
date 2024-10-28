package AlgRecursion.Dynamic;

public class Leetcode583 {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = word1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = word2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
//        计算出两个字符串的最长公共子序列长度lcs
        int lcs = dp[m][n];
//          两个字符串的长度分别为m和n，那么需要删除的字符个数为m - lcs + n - lcs
        return m - lcs + n - lcs;
    }
}
