package AlgRecursionTrain.NC105;


class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 如果目标值存在返回下标，否则返回 -1
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        int index=-1;
        int length=nums.length;
        int mid=length/2;
        int end=length-1;
        int start=0;

        while (end>start){

            if(target<nums[mid]){
                end=mid;
                mid=mid/2;
            }
            if(target>nums[mid]){
                start=mid;
                mid=((end-mid+1)/2)+mid;
            }
            if(target==nums[mid]){
                while (mid!=0&&nums[mid]==nums[mid-1])
                    mid--;
                return mid;
            }

        }
        return index;
    }
}
public class NC105 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] temparr=new int[]{-2,1,2};
        System.out.println(solution.search(temparr,2));
    }
}
