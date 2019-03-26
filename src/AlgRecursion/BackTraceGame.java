package AlgRecursion;

import java.util.Iterator;

public class BackTraceGame {
	static int map=0;
	static int queeCount=0;
	static int a[][]= {
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
	};
	public BackTraceGame() {
		// TODO Auto-generated constructor stub
	}
	

	public static void printer() {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	//x,y为下棋的坐标
	public static void findQueen(int i) {
		
		if(i>7) {
			map=map+1;
			printer();
			return;
		}
		
		
		
		for(int m=0;m<=7;m++) {
			if(check(i, m)) {
				a[i][m]=1;
				findQueen(i+1);
				a[i][m]=0;
			}
		}
		
		
		
		
	}
	
	public static boolean check(int k,int j) {
		//由于每次是迭代一行所以不必检查横排
		for(int i=0;i<8;i++){//检查行列冲突
	         if(a[i][j]==1){
	                return false;
	         }
	    }
	    for(int i=k-1,m=j-1; i>=0 && m>=0; i--,m--){//检查左对角线
	        if(a[i][m]==1){
	                return false;
	        }
	    }
	    for(int i=k-1,m=j+1; i>=0 && m<=7; i--,m++){//检查右对角线
	        if(a[i][m]==1){
	                return false;
	        }
	    }
	   
//		由于每次迭代是从上往下所以不必检查左下，右下
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("八皇后问题");
	    findQueen(0);
	    System.out.println("八皇后问题共有："+map+"种可能");
	}

}
