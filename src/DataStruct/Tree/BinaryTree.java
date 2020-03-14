package DataStruct.Tree;

/**
 * 	二叉树
 * @author Administrator
 *
 */


public class BinaryTree {

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}

	
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
