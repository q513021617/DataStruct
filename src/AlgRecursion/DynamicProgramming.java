package AlgRecursion;

import java.math.BigInteger;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class DynamicProgramming {

	
	static int sum = 0; // 记录手中的牌的数目
    static int ans = 0; // 记录结果
    
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
