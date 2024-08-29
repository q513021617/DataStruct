package AlgRecursion.Math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Bottile {

  int getResult(int a){
      int[] f=new int[a/3];
      f[0]=1;
      f[1]=2;
      int i=0;
      int sum=0;
      while (true){
          f[a/3]=a/3;
          if(sum==a){

          }
          i++;
      }
  }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String num = a.substring(2, a.length());

        String rse = new StringBuffer(num).reverse().toString();
        int len = num.length();
        int ten = 0;
        String tmp;
        for (int i = 0; i < len; i++) {
            if (rse.charAt(i) < 'A') {
                tmp = String.valueOf(rse.charAt(i));
                int intnum = Integer.parseInt(tmp);
                ten += intnum * (Math.pow(16, i));
            } else {
                int intnum = (rse.charAt(i) - 'A') + 10;
                ten += intnum * (Math.pow(16, i));
            }
        }

        System.out.println("" + ten);

    }
}
