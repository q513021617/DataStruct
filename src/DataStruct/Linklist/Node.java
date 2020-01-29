package DataStruct.Linklist;

public class Node {
    int data;
    Node next;

    public Node() {}
    public Node(int data) {
        this.data = data;
    }
    public void display() {
        System.out.print(this.data+" ");
    }
}
