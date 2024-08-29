package AlgRecursion.Dynamic;

public class Leetcode70 {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int f[]=new int[46];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        Leetcode70 leetCode70 = new Leetcode70();
        int i = leetCode70.climbStairs(45);
        System.out.printf(i+"");
    }
}
