package DataStruct.Tree;

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

    // 小的数在左边，大的数字在右边

    public Node find(int key,Node root) {

        Node current=root;

        while(current!=null) {

            if(current.data > key) {

                current=current.leftChild;

            }

            if(current.data < key) {

                current=current.rightChild;
            }

            return current;
        }

        return null;
    }

//   在二叉树中插入值
    public boolean insert(int data,Node root) {

        Node newNode=new Node(data);

        if(root==null) {

            root=newNode;
            return true;

        }else {

            Node current=root;
            Node parentNode=null;

            while( current!=null ) {

                parentNode=current;

                if(current.data>data) {

                    current=current.leftChild;

                    if(current==null) {

                        parentNode.leftChild=newNode;
                        return true;

                    }

                }

                if(current.data <= data) {

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

    // 中根遍历
    public void infixOrder(Node current) {

        if(current!=null) {
            infixOrder(current.leftChild);
            System.out.print(current.data+" ");
            infixOrder(current.rightChild);
        }


    }

    //前序遍历
    public void preOrder(Node current) {

        if(current!=null) {
            System.out.print(current.data+" ");
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }

    }

    //后序遍历
    public void postOrder(Node current){

        if(current != null){

            postOrder(current.leftChild);
            postOrder(current.rightChild);
            System.out.print(current.data+" ");

        }}
}
