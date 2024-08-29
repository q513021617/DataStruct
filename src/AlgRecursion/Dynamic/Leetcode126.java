package AlgRecursion.Dynamic;

public class Leetcode126 {
    public int fib(int n) {
        int[] f=new int[101];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=(f[i-1]+f[i-2] )%1000000007;
        }
        return f[n];
    }

    public static void main(String[] args) {
        Leetcode126 leetcode126 = new Leetcode126();
        int fib = leetcode126.fib(48);
        System.out.printf(""+fib);
    }
}
