package DataStruct.Stack;

public class StackList<T> {
    int size;
    Node<T> top;

    public StackList() {

    }
    public boolean push(T t) {

        if (this.top == null) {
            this.top=new Node<>(t);
            this.size++;
            return true;
        }
        Node tempNode=this.top;
        this.top.next=new Node(t);
        this.top=this.top.next;
        this.top.pre=tempNode;
        this.size++;
        return true;
    }

    public T pop() {

        if (this.top == null) {
            System.out.println("栈空了!!");
            return null;
        }

        T tempdata = this.top.data;

        this.top=this.top.pre;
        this.size--;
        return tempdata;

    }

    public void display(){
        if (this.top == null) {
            System.out.println("栈已经空了!!");
        }
        Node tempNode=this.top;

        while (tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode=tempNode.pre;
        }

        System.out.println();
    }
}
