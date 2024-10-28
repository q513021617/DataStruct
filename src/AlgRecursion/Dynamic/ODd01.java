package AlgRecursion.Dynamic;

import java.util.Scanner;

public class ODd01 {

    static int ans = 999999;

    public int jumpCount(int[] nums,int index,int sum)
    {
        if(index>=nums.length-1)
        {
            return sum;
        }

        int temp=nums[index];
        return jumpCount(nums,index+temp,sum+1);
    }


    public int jump(int[] nums) {
        for (int i = 1; i <= nums[0]; i++) {
            int count = jumpCount(nums, i, 0);
            if (count>0) {
                ans = Math.min(ans, count);
            }
        }
        return ans;
    }


    public static void main(String[] args)
    {
        int[] arr={2,3,1,1,4};
        int jump = new ODd01().jump(arr);
        System.out.println(jump);
    }
}
