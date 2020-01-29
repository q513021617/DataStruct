package DataStruct.Array;

public class Myarry {
    //数组
    private long[] arr;
    //数组中有效数据的大小
    private int length;

    //默认构造函数
    public Myarry(){
        arr=new long[50];
    }

    public Myarry(int max){
        arr=new long[max];
    }
    //插入数据
    public void insert(long value){
        arr[length]=value;
        length++;
    }
    //显示数据
    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    //查找数据
    public int find(long searchKey){

        int i;

        for(i=0;i<length;i++){
            if(arr[i]==searchKey){
                break;
            }
        }

        if(i==arr.length){

            System.out.println("查找不到指定数据");
            return -1;
        }else{
            System.out.println("找到指定数据，下标为:"+i);
            return i;
        }




    }

    //删除数据
    public void delete(long deleteKey){
        if(find(deleteKey)==-1){
            System.out.println("查找不到指定数据，删除失败");
        }else{
            for(int i=find(deleteKey);i<length;i++){
                arr[i]=arr[i+1];
            }

        }

    }
    //修改数据
    public void edit(int newvalue,int oldvalue){
        if(find(oldvalue)==-1){
            System.out.println("查找不到指定数据,删除数据");
        }else{
            arr[find(oldvalue)]=newvalue;
        }

    }

}
