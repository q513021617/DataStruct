package DataStruct.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        QueueByArry<Integer> tempQueue=new QueueByArry<>(5);
        tempQueue.In_Queue(1);
        tempQueue.In_Queue(1);
        tempQueue.In_Queue(1);
        tempQueue.In_Queue(1);
        tempQueue.In_Queue(1);
        tempQueue.In_Queue(2);
        tempQueue.display();
        tempQueue.In_Queue(3);
        tempQueue.display();

        System.out.println("出队: "+tempQueue.Out_Queue());
        tempQueue.In_Queue(3);
        tempQueue.display();

        QueueByLinkList<Integer> queueByLinkList=new QueueByLinkList<>();
        queueByLinkList.InQueue(1);
        queueByLinkList.InQueue(2);
        queueByLinkList.InQueue(3);
        queueByLinkList.InQueue(4);
        queueByLinkList.InQueue(5);
        queueByLinkList.display();
        System.out.println("出队: "+ queueByLinkList.OutQueue());
        System.out.println("出队: "+ queueByLinkList.OutQueue());
        queueByLinkList.display();
        System.out.println("出队: "+ queueByLinkList.OutQueue());
        System.out.println("出队: "+ queueByLinkList.OutQueue());
        queueByLinkList.display();
        System.out.println("出队: "+ queueByLinkList.OutQueue());
        queueByLinkList.display();

        System.out.println("出队: "+ queueByLinkList.OutQueue());
    }
}
