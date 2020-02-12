package DataStruct.Queue;

public class Node<T> {
    T data;
    Node next;

    public Node() {}
    public Node(T data) {
        this.data = data;
    }
    public void display() {
        System.out.print(this.data+" ");
    }
}
