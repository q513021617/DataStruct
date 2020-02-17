package DataStruct.HashTable;

import java.util.Arrays;
import java.util.Map;


/**
 * 基于数组实现的散列结构(HashTable)
 *
 * 存在较多的bug但是只是用于研究散列结构学习之用
 *
 */
public class HashTable {

    int[] arry;

    public HashTable(int maxsize) {

        arry=new int[maxsize];

    }

    public boolean put(int key,int value){

        if( key != this.arry[key] ){

            this.arry[key]=value;

            return true;
        }
        System.out.println("这个值已经存在: "+value);
            return false;
    }


    @Override
    public String toString() {
        return "HashTable{" +
                "arry=" + Arrays.toString(arry) +
                '}';
    }
}
