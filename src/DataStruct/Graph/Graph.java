package DataStruct.Graph;

import java.util.Scanner;

public class Graph {
	
	static final int MaxNum=20;   //最大节点数目
	static final int MaxValue=65535;
	char[] Vertex = new char[MaxNum]; //定义数组，保存顶点信息
	
	int GType;  //图的类型0：无向图  1：有向图
	int VertxNum;  //顶点的数量
	int EdgeNum;  //边的数量
	
	int[][] EdgeWeight = new int[MaxNum][MaxNum];    //定义矩阵保存边的信息
	int[] isTrav = new int[MaxNum];  //遍历标志

	//构造图
		static void createGraph(Graph g){
			int i,j,k;
			int weight;     //权重
			char EstartV,EndV;     //边的起始顶点，结束的定点

			System.out.println("输入途中各顶点的信息");
			for(i=0; i < g.VertxNum; i ++)
			{
				System.out.println("第" + (i+1) + "个顶点");
				Scanner scan=new Scanner(System.in);
				g.Vertex[i] = (scan.next().toCharArray() )[0];
			}
			System.out.println("输入构成各边的顶点和权值");
			for(k=0;k<g.EdgeNum;k++)
			{
				System.out.println("第" + (k+1) + "条边：");
				Scanner scan=new Scanner(System.in);
				EstartV = scan.next().charAt(0);
				EndV = scan.next().charAt(0);
				weight = scan.nextInt();
				for(i=0; EstartV!=g.Vertex[i] ; i++);
				for(j=0; EndV != g.Vertex[j]; j++);
				g.EdgeWeight[i][j] = weight;
				if(g.GType == 0)
					g.EdgeWeight[j][i] = weight;
			}
		}

	//清空图
		static void clearGraph(Graph g){
			int i,j;
			for(i=0; i< g.VertxNum; i++)
				for(j =0; j<g.VertxNum; j++)
					g.EdgeWeight[i][j] = Graph.MaxValue;
		}

	//输出邻接矩阵
		static void OutGraph(Graph g){
			int i,j;
			for(j = 0; j < g.VertxNum;j ++)
				System.out.print("\t" + g.Vertex[j]);
			System.out.println();
			
			for(i =0 ;i <g.VertxNum; i ++)
			{
				System.out.print( g.Vertex[i]);
				for(j = 0;j < g.VertxNum; j++)
				{
					if(g.EdgeWeight[i][j] == Graph.MaxValue)
						System.out.print("\tZ");
					else
						System.out.print("\t" + g.EdgeWeight[i][j]);
				}
				System.out.println();
			}
		}

	//遍历图
		static void DeepTraOne(Graph g,int n){
			int i;
			g.isTrav[n] = 1;
			System.out.println("—>" + g.Vertex[n]); //输出节点数据
			//添加处理节点的操作
			for(i = 0; i< g.VertxNum; i++)
			{
				//if(g.EdgeWeight[n][i] != g.MaxValue && g.isTrav[n] == 0)
				if(g.EdgeWeight[n][i] != g.MaxValue && g.isTrav[i] == 0)
					{
						DeepTraOne(g, i);
					}
			}
		}

	//深度优先遍历 DFS
		static void  DeepTraGraph(Graph g){

			int i;
			for(i = 0; i< g.VertxNum; i++)
			{
				g.isTrav[i]= 0;
			}
			System.out.println("深度优先遍历：");
			for(i = 0; i< g.VertxNum ; i++)
			{
				if(g.isTrav[i] == 0)
					DeepTraOne(g,i);
			}
			System.out.println();

		}

//	广度优先遍历 BFS



		public static void main(String[] args) {

			Graph g = new Graph();
			System.out.println("输出生成图的类型：");
			Scanner scan=new Scanner(System.in);
			g.GType = scan.nextInt();   //图的种类

			System.out.println("输入图的顶点数量：");
			g.VertxNum = scan.nextInt();

			System.out.println("输入图的边数量：");
			g.EdgeNum = scan.nextInt();
			
			clearGraph(g);          //清空图
			createGraph(g);      //生成邻接表结构的图
			System.out.println("该图的邻接矩阵数据如下：");
			OutGraph(g);         //输出图
			DeepTraGraph(g);    //深度优先遍历图
			
		}

}
