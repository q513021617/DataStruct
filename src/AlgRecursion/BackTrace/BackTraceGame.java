package AlgRecursion.BackTrace;

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
	
	
	
	//x,yΪ���������
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
		//����ÿ���ǵ���һ�����Բ��ؼ�����
		for(int i=0;i<8;i++){//������г�ͻ
	         if(a[i][j]==1){
	                return false;
	         }
	    }
	    for(int i=k-1,m=j-1; i>=0 && m>=0; i--,m--){//�����Խ���
	        if(a[i][m]==1){
	                return false;
	        }
	    }
	    for(int i=k-1,m=j+1; i>=0 && m<=7; i--,m++){//����ҶԽ���
	        if(a[i][m]==1){
	                return false;
	        }
	    }
	   
//		����ÿ�ε����Ǵ����������Բ��ؼ�����£�����
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("�˻ʺ�����");
	    findQueen(0);
	    System.out.println("�˻ʺ����⹲�У�"+map+"�ֿ���");
	}

}
