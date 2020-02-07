package DataStruct.Linklist;

public class LinkList {
    int a;
    int cur;
    Node first;
    Node tail;

    public LinkList() {
        this.first=null;
    }

    public boolean add(int i) {

        Node node = new Node(i);
        if (first == null) {
            tail = node;
            first = tail;
            this.cur++;

        } else {
            tail = tail.next = node;
            this.cur++;
        }
        return true;

    }


    /**
     *  删除第一个元素
      * @return Node
     */
    public Node deleteFirst(){
        Node temp=first;
        first = temp.next;
        return temp;
    }

    /**
     * 显示方法
     */
    public void display(){
            Node current=first;
            while (current!=null){
                current.display();
                current =current.next;
            }
    }

    /**
     * 查找方法
     * @param value
     * @return
     */
    public Node find(long value){
        Node current=first;
        while (current.data != value){
            if(current.next == null){
                return null;
            }
            current=current.next;
        }

        return current;
    }

/**
 * 删除方法，根据数据来进行删除
 */

public Node delete(long value){
    Node current=first;
    Node previous=first;
    while (current.data != value){
        if (current.next == null) {
            return null;
        }
        previous = current;
        current= current.next;
    }

    if (current == first) {
        first=first.next;
    }else {
        previous.next=current.next;
    }


    return current;
}


}
