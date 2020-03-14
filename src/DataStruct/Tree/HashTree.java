package DataStruct.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 哈夫曼树
 *
 *
 */
public class HashTree {


    Integer weight;
    HashTree left,right;

    public HashTree() {}

    public static HashTreeNode createHashTree(int[] arr) {
        List<HashTreeNode> nodes= new ArrayList<>();
        for (int value:arr ) {
            nodes.add(new HashTreeNode(value));
        }

        while (nodes.size()>1 ){
            Collections.sort(nodes);
            System.out.println("nodes = "+nodes);

            HashTreeNode leftNode=nodes.get(0);
            HashTreeNode rightNode=nodes.get(1);
            HashTreeNode parent=new HashTreeNode(leftNode.data+rightNode.data);
            parent.leftChild=leftNode;
            parent.rightChild=rightNode;
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(parent);
            System.out.println("剩余节点:"+nodes);
        }


        return nodes.get(0);
    }

    public static void main(String[] args) {
            int[] arry=new int[]{13,7,8,3,29,6,1};
        HashTreeNode node=createHashTree(arry);
            node.postOrder(node);
    }

}


class HashTreeNode extends Node implements Comparable<HashTreeNode>{

    public HashTreeNode(int data) {
        super(data);
    }

    @Override
    public int compareTo(HashTreeNode o) {
//        从小到大
        return this.data-o.data;
    }

    @Override
    public String toString() {
        return " "+this.data;
    }
}