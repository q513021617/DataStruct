package DataStruct.Tree;

//平衡二叉树
public class ASlTree extends Node implements Comparable<Integer>{


    public ASlTree() {
        super(0);
    }

    @Override
    public int compareTo(Integer o) {
        return data-o;
    }

}
