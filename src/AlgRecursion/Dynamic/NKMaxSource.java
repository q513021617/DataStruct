package AlgRecursion.Dynamic;

/**
 * 输入
 * 3
 * 2 3 1
 * 6 9 2
 * 0 5 1
 *
 */
public class NKMaxSource {

    int ouputMaxCount(int num,int[][] source){
        int max=-1;
        for (int i = 0; i < num; i++) {
            int tempsource = source[i][2];

            if(tempsource>max){
                max=tempsource;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        NKMaxSource nkMaxSource = new NKMaxSource();
        int[][] newarr=new int[][]{{2,3,1},{6,9,2},{0,5,1}};

        int maxCount = nkMaxSource.ouputMaxCount(3, newarr);
        System.out.println(maxCount);
    }
}
