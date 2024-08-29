package AlgRecursion.Dynamic;

import java.util.HashMap;

public class Leetcode1 {


    /**
     *
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * 你可以按任意顺序返回答案。
     *
     * 示例 1：
     *
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * 示例 2：
     *
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * 示例 3：
     *
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n=nums.length;
        for (int i = 0; i < n; i++) {
//          判断 目标值target - nums[i] 的值存在则表示 有两个数相加等于目标值
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
//           将值和下表存入map中
            hashMap.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Leetcode1 leetcode1 = new Leetcode1();
        int[] twoSumArr = leetcode1.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        for (int i = 0; i < twoSumArr.length; i++) {
            System.out.print(twoSumArr[i]+" ");
        }

    }
}
