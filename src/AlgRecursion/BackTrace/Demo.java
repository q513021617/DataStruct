package AlgRecursion.BackTrace;

public class Demo {

    public static void main(String[] args)
    {
//        实现一个数组的回溯遍历数组中是否有皇后的解
        BackTraceGame bt=new BackTraceGame();
        bt.findQueen(0);

    }
}
