package AlgRecursion.Dynamic;

/**
 *  给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。 *
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * 请你计算并返回达到楼梯顶部的最低花费。
 *
 */
public class Leetcode746 {
    int min(int a,int b){
        return a<b?a:b;
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] f=new int[1001];
        f[0]=0;
        f[1]=0;
        int n=0;
        for(int i=2;i<=cost.length;i++){
            f[i]=min(f[i-1]+cost[i-1],f[i-2]+cost[i-2]);
            n=i;
        }
        return f[n];
    }


    public static void main(String[] args) {
        Leetcode746 leetCode746 = new Leetcode746();
        int[] f={10,15,20};
        int i = leetCode746.minCostClimbingStairs(f);
        System.out.printf(i+"");
    }
}
