package AlgRecursion.Dynamic;

public class LeetCode062 {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                if (i > 0) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j]);
                }
                if (j > 0) {
                    f[i][j] = Math.max(f[i][j], f[i][j - 1]);
                }
                f[i][j] ++;
            }
        }
        return f[m - 1][n - 1];
    }
    public static void main(String[] args)
    {

    }
}
