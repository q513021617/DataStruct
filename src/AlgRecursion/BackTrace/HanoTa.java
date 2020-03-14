package AlgRecursion.BackTrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 算法思路：1将 n-1个盘子先放到B座位上
          2.将A座上地剩下的一个盘移动到C盘上
          3、将n-1个盘从B座移动到C座上
*/
public class HanoTa {

	static void moveHano(int n,char one,char two,char three){
		
		if(n==1){
			move(one,three);
		}
		if (n != 1) {
//			将大的先移往暂存的 柱子上
			moveHano(n-1,one,three,two);
//			移动递归中的盘子到目标柱子上
			move(one,three);
//			最后将暂存的柱子上的盘子移往目标柱子上
			moveHano(n-1,two,one,three);
		}
		
	}

	static void move(char x,char y) {

		System.out.println(x+" -----> "+y);
		
	}
	
	public static void main(String[] args) {

		System.out.print("输入数字: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		moveHano(n,'A','B','C');

		System.out.println();
	}

}
