package AlgRecursion.Dynamic;

import java.math.BigInteger;
import java.util.Scanner;


public class DynamicProgramming {

	
	static int sum = 0; // ��¼���е��Ƶ���Ŀ
    static int ans = 0; // ��¼���
    
    public static void main(String[] args) {
    	  int[][] dp = new int[14][14];

          dp[0][0] = 1;

          for (int i = 1; i < 14; i++)

              for (int j = 0; j < 14; j++)

                  for (int k = 0; k < 5; k++)

                      if (j + k <= 13)

                          dp[i][j + k] += dp[i - 1][j];

          System.out.println(dp[13][13]);

    }
	
}
