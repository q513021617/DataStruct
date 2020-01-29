package DataStruct.Array;

public class OrderArry {
    //数组
    private long[] arr;
    //数组中有效数据的大小
    private int length;

//按照从小到大的顺序插入数据
    public void insert(long value){
        int i;
        for(i=0;i<length;i++){
            if(arr[i]>value){
                break;
            }
        }
        for(int j=length;j>i;j--){
            arr[j]=arr[j-1];
        }
        arr[i]=value;
        length++;
    }

}
