package AlgRecursion.Dynamic;

public class leetcode1617 {
    public int massage(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }

        // dp[i][0]：区间 [0, i] 里接受预约请求，并且下标为 i 的这一天不接受预约的最大时长
        // dp[i][1]：区间 [0, i] 里接受预约请求，并且下标为 i 的这一天接受预约的最大时长
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }

    public static void main(String[] args) {
        leetcode1617 leetCode127 = new leetcode1617();
        int[] temparr=new int[]{2,1,4,5,3,1,1,3};
        int i = leetCode127.massage(temparr);
        System.out.printf(i+"");
    }
}
