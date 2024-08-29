package AlgRecursion.Dynamic;

public class leetcodeCR127 {
    public int trainWays(int num) {
        int[] dp=new int[101];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= num; i++) {
            dp[i]=(dp[i-2]+dp[i-1])%1000000007;
        }
        return  dp[num];
    }

    public static void main(String[] args) {
        leetcodeCR127 leetCode127 = new leetcodeCR127();
        int i = leetCode127.trainWays(1000000008);
        System.out.printf(i+"");
    }
}
