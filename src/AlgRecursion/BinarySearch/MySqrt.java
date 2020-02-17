package AlgRecursion.BinarySearch;

public class MySqrt {

    public static int mySqrt(int x) {

        if (x < 2) return x;

        long num;
        int pivot, left = 2, right = x / 2;

        while (left <= right) {

            pivot = left + (right - left) / 2;

            num = (long)pivot * pivot;

            if (num > x) {
                right = pivot - 1;
                continue;
            }

            if (num < x) {
                left = pivot + 1;
                continue;
            }

            if (num == x){
                return pivot;
            }

        }

        return right;
    }

    public static void main(String[] args) {

//        System.out.println(mySqrt(2147395599));
//        System.out.println(mySqrt(9));
        System.out.println(mySqrt(16));
    }

}
