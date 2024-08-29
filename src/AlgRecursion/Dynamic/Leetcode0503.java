package AlgRecursion.Dynamic;

import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * 给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，找出你能够获得的最长的一串1的长度。
 *
 * 示例 1：
 *
 * 输入: num = 1775(11011101111)
 * 输出: 8
 * 示例 2：
 *
 * 输入: num = 7(0111)
 *      111
 * 输出: 4
 */
public class Leetcode0503 {

    public   int reverseBits(int num) {
        //将num转换为32位的二进制数组 小端存储
        int [] chars = new int[32];
        int index  =0;
        while (index<chars.length){
            chars[index]=num&1;
            System.out.print(chars[index]);
            num= num>>1;
            index++;
        }
        System.out.println();
        //计算连续出现1的数量
        int [] arr =new int[chars.length+1];
        int oneNum=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==1){
                oneNum++;
            }else {
                oneNum=0;
            }
            arr[i+1]=oneNum;
        }
        int preZero=-1;
        int max =0;
        //计算当0变为1时，连续出现1的次数
        for (int i = 1; i < arr.length; i++) {
            //记录已经遍历过的最近出现0的位置
            if (arr[i]==0){
                preZero=i;
            }
            //到i为止1连续出现的次数
            int arri = arr[i];
            //上1个0出现之前连续1出现的次数， 当0变为1时，两次相加，加上1个0的次数
            int arrpre=preZero!=-1?arr[preZero-1]+1:0;
            //两个连续的次数相加
            int count = arrpre+arri;
            //计算最值
            max =  Math.max(max,count);
        }
        return max;
    }



    public static void main(String[] args) {
        Leetcode0503 leetcode = new Leetcode0503();

        int reverseBits = leetcode.reverseBits(1775);
        System.out.println(reverseBits);
    }
}
