package AlgRecursion.BinarySearch;

public class BasicBinarySearch {

        public static int  binarySearch(int keyvalue,int[] arry){
            int min=0;
            int max=arry.length-1;
            int mid = (min+max) /2;

            while (mid<max) {

                if (arry[mid] == keyvalue) {
                    return mid;
                }

                if (arry[mid] != keyvalue) {

                    if(arry[mid] < keyvalue){
                        min = mid+1;
                        mid = (min+max) /2;
                        continue;
                    }
                    if(arry[mid] > keyvalue){
                        max = mid-1;
                        mid = (min+max) /2;
                        continue;
                    }
                }


                System.out.println("查找了一次");
            }
            if(mid==max && max==min ){
                return mid;
            }
            return 0;
        }
    public static void main(String[] args) {

        int[] arry=new int[]{1,2,3,4,5};

        System.out.println(binarySearch(5,arry));




    }
}
