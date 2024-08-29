package AlgRecursion.Dynamic;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class LeetcodeLCR007 {
    /**
     *
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a ，b ，c ，使得 a + b + c = 0 ？请找出所有和为 0 且 不重复 的三元组。
     *
     * 示例 1：
     *
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 示例 2：
     *
     * 输入：nums = []
     * 输出：[]
     * 示例 3：
     *
     * 输入：nums = [0]
     * 输出：[]
     * 提示：
     *
     * 0 <= nums.length <= 3000
     * -105 <= nums[i] <= 105
     *
     */

    /**
     *    该算法核心思想是利用两个指针找到  b+c =-a
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            int third=n-1;
            int target=-nums[first];
            for (int sencond = first+1; sencond < n; sencond++) {
                if(sencond>first+1&&nums[sencond]==nums[sencond-1]){
                    continue;
                }
//               核心算法 指针向中间移动移动
                while (sencond<third&&(nums[sencond]+nums[third])>target){
                    --third;
                }
                if(sencond==third){
                    break;
                }
                    if((nums[sencond]+nums[third])==target){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[sencond]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
            }
        }
        return ans;
    }

    static Semaphore semaphore = new Semaphore(3);
    public static void main(String[] args) {






    }



}
