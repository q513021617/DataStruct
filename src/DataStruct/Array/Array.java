package DataStruct.Array;

public class Array {
    public static void main(String[] args) {
        //创建数组
        int[] intArray=new int[10];
        //插入数据
        intArray[1]=10;
        //显示数据
        for (int i:intArray) {

            System.out.print(i+" ");
        }
        System.out.print("\n");

        //查找数据
        int j=0;
        for (int i:intArray) {

            if (i==10){
                System.out.println("找到目标值:"+i+"坐标:"+j);
            }
            j++;
        }

        //删除数据
        j=0;
        intArray=new int[]{1,10,3,4,5,6,7};
        int[] intBArray=new int[6];
        //删除数据
        for (int i=0;i<intArray.length;i++) {
            if (i==6) break;
            if(i!=0) {
                intBArray[i]=intArray[i+1];
            }else {
                intBArray[i]=intArray[i];
            }

        }

        for (int b:intBArray) {
            System.out.print(b+" ");
        }

        System.out.println(" ");

        //修改数据
        j=0;
        intArray=new int[]{1,10,3,4,5,6,7};

        for (int i=0;i<intArray.length;i++) {

            if (i==2) {
                intArray[i]=2;
                break;
            }

        }

        for (int b:intArray) {
            System.out.print(b+" ");
        }

        System.out.println();
        System.out.println("----对称 换位------ ");

        //对称 换位
        j=0;
        intArray=new int[]{1,10,3,4,5,6,7};
        for (int i=0;i<intArray.length;i++) {

            if (!(i==intArray.length/2)) {
                int t=intArray[i];
                intArray[i]=intArray[intArray.length-i-1];
                intArray[intArray.length-i-1]=t;
            }else {
                break;
            }

        }

        for (int b:intArray) {
            System.out.print(b+" ");
        }
    }
}
