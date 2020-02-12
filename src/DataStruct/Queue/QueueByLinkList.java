package DataStruct.Queue;

import java.util.ArrayList;
import java.util.List;

public class QueueByLinkList<T> {

    Node font;
    Node rear;

    public QueueByLinkList() {

        this.font=new Node<T>();

    }

    public void InQueue(T t) {

        Node tempnode=new Node<T>(t);

        if (this.isEmpty(this.rear)) {
            this.font=tempnode;
            this.rear=this.font;
            return;
        }


        this.font.next = tempnode;
        this.font=this.font.next;


    }

    public Object OutQueue() {

        if (isEmpty(this.rear)) {
            return new Node<T>();
        }
        Node tempnode = this.rear;

        this.rear=this.rear.next;
        return tempnode.data;
    }

    public boolean isEmpty(Node currqueue){

        if ( currqueue == null) {
            System.out.println("该队列为空了");
            return true;
        }
        return false;
    }
    public void display(){

        Node tempnode = this.rear;
            while (!this.isEmpty(tempnode)){
                System.out.print(tempnode.data+" ");
                tempnode=tempnode.next;
            }

        System.out.println();
    }

}
