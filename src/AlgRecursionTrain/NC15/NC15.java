package AlgRecursionTrain.NC15;

import java.util.ArrayList;

class TreeNode {
   int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 }
public class NC15 {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {


        return null;
    }

    TreeNode buildTree(char[] temparr,TreeNode treeNode,int i){

        if(temparr[i]=='#'){

            return treeNode;
        }

        treeNode.val=temparr[i];
        treeNode.left=new TreeNode();
        treeNode.left=buildTree(temparr,treeNode.left,++i);
        treeNode.right=new TreeNode();
        treeNode.right=buildTree(temparr,treeNode.right,++i);
        return treeNode;
    }

    public static void main(String[] args) {


        NC15 nc15 = new NC15();
        TreeNode treeNode=new TreeNode();
        char[] chars = {3, 9, 20, '#', '#', 15, 7};
        treeNode.val=3;
        nc15.buildTree(chars, treeNode,1);



        nc15.levelOrder(treeNode);

    }
}
