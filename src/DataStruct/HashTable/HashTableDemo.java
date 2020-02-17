package DataStruct.HashTable;

public class HashTableDemo {

    public static void main(String[] args) {
        int[] intarry=new int[]{1,2,3,4,5};
        HashTable hashTable;
        hashTable=new HashTable(intarry.length*2);

        for (int i = 0; i < intarry.length; i++) {
            hashTable.put(intarry[i],intarry[i]);

        }

        int temp = 3;
        hashTable.put(1,1);
        hashTable.put(4,4);
        hashTable.put(5,5);

        hashTable.put(6,6);

        System.out.println(hashTable);
    }
}
