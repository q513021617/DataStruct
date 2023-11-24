package AlgRecursion.Dynamic;

public class LeetCode1342 {

    /** 题目描述：
     * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
     *
     */
    int max=1000000;
    public int numberOfSteps(int num) {

        int[] f=new int[max+1];
        f[0]=0;
        for(int i=1;i<=num;i++){
            if((i%2)==1){
                f[i]=f[i-1]+1;
            }else{
                f[i]=f[i/2]+1;
            }
        }
        return f[num];
    }

    public static void main(String[] args) {
        LeetCode1342 leetCode1342 = new LeetCode1342();
        int i = leetCode1342.numberOfSteps(leetCode1342.max);
        System.out.printf(i+"");
    }
}
