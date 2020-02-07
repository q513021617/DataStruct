package DataStruct.Graph;

import java.util.Scanner;

public class Graph {
	
	static final int MaxNum=20;        //���ڵ���Ŀ
	static final int MaxValue=65535;
	char[] Vertex = new char[MaxNum];         //�������飬���涥����Ϣ
	
	int GType;   //ͼ������0������ͼ  1������ͼ
	int VertxNum;              //���������
	int EdgeNum;         //�ߵ�����
	
	int[][] EdgeWeight = new int[MaxNum][MaxNum];     //������󱣴涥����Ϣ
	int[] isTrav = new int[MaxNum];            //������־

	//�����ڽӾ���ͼ
		static void createGraph(Graph g){
			int i,j,k;
			int weight;     //Ȩ
			char EstartV,EndV;      //�ߵ���ʼ����
			
			System.out.println("����;�и��������Ϣ");
			for(i=0; i < g.VertxNum; i ++)
			{
				System.out.println("��" + (i+1) + "������");
				Scanner scan=new Scanner(System.in);
				g.Vertex[i] = (scan.next().toCharArray() )[0];
			}
			System.out.println("���빹�ɸ��ߵĶ����Ȩֵ");
			for(k=0;k<g.EdgeNum;k++)
			{
				System.out.println("��" + (k+1) + "���ߣ�");
				Scanner scan=new Scanner(System.in);
				EstartV = scan.next().charAt(0);
				EndV = scan.next().charAt(0);
				weight = scan.nextInt();
				for(i=0; EstartV!=g.Vertex[i] ; i++);           //�����ж����в��ҿ�ʼ�ڵ�
				for(j=0; EndV != g.Vertex[j]; j++);             //�����нڵ��ϲ����ս��
				g.EdgeWeight[i][j] = weight;       //��Ӧλ�ñ���Ȩ�أ���ʾ��һ����
				if(g.GType == 0)               //���������ͼ���ڶԽ�λ�ñ���Ȩ��
					g.EdgeWeight[j][i] = weight;
			}
		}
		
		//���ͼ
		static void clearGraph(Graph g){
			int i,j;
			for(i=0; i< g.VertxNum; i++)
				for(j =0; j<g.VertxNum; j++)
					g.EdgeWeight[i][j] = Graph.MaxValue;           //���þ����и�Ժ�ص�ֵΪMaxValue
		}

		//����ڽӾ���
		static void OutGraph(Graph g){
			int i,j;
			for(j = 0; j < g.VertxNum;j ++)
				System.out.print("\t" + g.Vertex[j]);      //�ڵ�һ�����붥����Ϣ
			System.out.println();
			
			for(i =0 ;i <g.VertxNum; i ++)
			{
				System.out.print( g.Vertex[i]);
				for(j = 0;j < g.VertxNum; j++)
				{
					if(g.EdgeWeight[i][j] == Graph.MaxValue)    //��ȨֵΪ���ֵ
						System.out.print("\tZ");    //Z ��ʾ�����
					else
						System.out.print("\t" + g.EdgeWeight[i][j]);  //����ߵ�Ȩ��
				}
				System.out.println();
			}
		}
		//����ͼ
		static void DeepTraOne(Graph g,int n){//�ӵ�n���ڵ㿪ʼ����
			int i;
			g.isTrav[n] = 1;              //���Ϊ1��ʾ�ö����Ѿ��������
			System.out.println("��>" + g.Vertex[n]); //����ڵ�����
			//��Ӵ���ڵ�Ĳ���
			for(i = 0; i< g.VertxNum; i++)
			{
				//if(g.EdgeWeight[n][i] != g.MaxValue && g.isTrav[n] == 0)
	                        if(g.EdgeWeight[n][i] != g.MaxValue && g.isTrav[i] == 0)
					{
						DeepTraOne(g, i);     //�ݹ���б���
					}
			}
		}
		
		//������ȱ���
		static void  DeepTraGraph(Graph g){
			int i;
			for(i = 0; i< g.VertxNum; i++)
			{
				g.isTrav[i]= 0;
			}
			System.out.println("������ȱ�����");
			for(i = 0; i< g.VertxNum ; i++)
			{
				if(g.isTrav[i] == 0)
					DeepTraOne(g,i);
			}
			System.out.println();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Graph g = new Graph();
			System.out.println("�������ͼ�����ͣ�");
			Scanner scan=new Scanner(System.in);
			g.GType = scan.nextInt();  //ͼ������
			
			System.out.println("����ͼ�Ķ���������");
			g.VertxNum = scan.nextInt();
			
			System.out.println("����ͼ�ı�������");
			g.EdgeNum = scan.nextInt();
			
			clearGraph(g);          //���ͼ
			createGraph(g);      //�����ڽӱ�ṹ��ͼ
			System.out.println("��ͼ���ڽӾ����������£�");
			OutGraph(g);        //���ͼ
			DeepTraGraph(g);    //������ȱ���ͼ
			
		}

}
