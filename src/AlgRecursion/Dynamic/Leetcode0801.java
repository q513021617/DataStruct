package AlgRecursion.Dynamic;

public class Leetcode0801 {
    public int waysToStep(int n) {
        int[] f=new int[1000001];
        f[0]=1;
        f[1]=2;
        f[2]=4;
        for(int i=3;i<=n;i++){
            int temp=(f[i-1]+f[i-2])%1000000007;
            f[i]=(temp+f[i-3])%1000000007;
        }
        return f[n-1];
    }
    public static void main(String[] args) {
        Leetcode0801 leetcode = new Leetcode0801();
        int fib = leetcode.waysToStep(3);
        System.out.printf(""+fib);
    }
}
