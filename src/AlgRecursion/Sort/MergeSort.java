package AlgRecursion.Sort;

public class MergeSort {

    /**
     *  归并排序
     * @param nums
     * @param l
     * @param r
     * @return
     */
    public static int[] mergeSort(int[] nums, int l, int r) {

        if (l == r)
            return new int[] { nums[l] };

        int mid = l + (r - l) / 2;
//        切分左边数组
        int[] leftArr = mergeSort(nums, l, mid); //左有序数组
//         切分右边数组
        int[] rightArr = mergeSort(nums, mid + 1, r); //右有序数组
//    将要重新构成的数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;

//      从小到大存进新数组，但是有一边数组溢出就会结束循环，因此，只能在接下来的步骤将没有比较完的数存进数组
        while (i < leftArr.length && j < rightArr.length) {

            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }

        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];

        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;

    }

    public static void main(String[] args) {

        int[] nums = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        for (int x : newNums) {
            System.out.print(x+" ");
        }

    }
}
