package DataStruct.Tree;

/**
 * 	�����������ṹ�ӱ���
 * @author Administrator
 *
 */
class Node{
	int data;
	Node leftChild;
	Node rightChild;
	
	public Node(int data2) {
		this.data=data2;
	}
	public void display() {
		System.out.println(data);
	}
	
	public Node find(int key,Node root) {
		
		Node current=root;
		
		while(current!=null) {
			
			if(current.data > key) {
				
				current=current.leftChild;
				
			}else if(current.data < key) {
				
				current=current.rightChild;
			}else {
				return current;
			}
		}
		
		return null;
	}
	
	public boolean insert(int data,Node root) {
		Node newNode=new Node(data);
		if(root==null) {
			
			root=newNode;
			return true;
		}else {
			Node current=root;
			Node parentNode=null;
			
			while(current!=null) {
				parentNode=current;
				if(current.data>data) {
					current=current.leftChild;
					if(current==null) {
						parentNode.leftChild=newNode;
						return true;
					}
				}else {
					current=current.rightChild;
					if(current==null) {
						parentNode.rightChild=newNode;
						return true;
					}
				}
			}
			
		}
		
		return false;
	}
	
	//������� �������:���������������ڵ㡪����������
	public void infixOrder(Node current) {
		
		if(current!=null) {
			infixOrder(current.leftChild);
			System.out.print(current.data+" ");
			infixOrder(current.rightChild);
		}
		
		
	}
	//ǰ����� ���ڵ㡪����������������������
	public void preOrder(Node current) {
		if(current!=null) {
			System.out.print(current.data+" ");
			preOrder(current.leftChild);
			preOrder(current.rightChild);
		}
	}
	
	//������� ���������������������������ڵ�
	public void postOrder(Node current){
	    if(current != null){
	        postOrder(current.leftChild);
	        postOrder(current.rightChild);
	        System.out.print(current.data+" ");
	    }}
}

public class BinaryTree {

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	//����ֵ,С��ֵ����ߣ����ֵ���ұ�
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node(9);
		node.insert(2,node);
		node.insert(10,node);
		node.insert(7,node);
		node.insert(11,node);
		node.insert(1,node);
		node.infixOrder(node);
		System.out.println();
		node.postOrder(node);
		System.out.println();
		node.preOrder(node);
	}

}
