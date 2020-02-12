package DataStruct.Queue;

/**
 * 简单的队列结构
 *
 * 根据定义，队列都有一个头指针和一个尾指针
 *
 * 这种基于顺序结构的队列会出现溢出问题
 *
 */
public class QueueByArry<T> {

    T t;

    Object[] queueArry;
    int front;
    int rear;
    int size;
    int maxsize;

    public QueueByArry(int maxsize) {

        this.maxsize=maxsize;
        this.queueArry=new Object[maxsize];
        this.size=0;
        this.front=0;
        this.rear=0;
    }

    public void In_Queue(T x){

        if (!this.isOverfllow()) {

            this.queueArry[this.front++]=x;
            this.size++;

        }

    }

    public Object Out_Queue(){

        if (this.isEmpty()) {

            return new Object();
        }
        this.size--;
        return this.queueArry[this.rear++];
    }

    public boolean isEmpty(){
        if (this.front == this.rear) {
            System.out.println("此队列为空!没有任何元素");
            return true;
        }
        return false;
    }

    public boolean isOverfllow(){

        if (this.size==this.maxsize) {
            System.out.println("此队列已满!不能再插入任何元素");
            return true;
        }
        return false;
    }
    public void display(){
        if (!this.isEmpty()) {

            for (int i = this.rear; i <= this.front-1; i++) {
                System.out.print(this.queueArry[i]+" ");
            }
            System.out.println();
        }

    }
//    public T getT() {
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }
//
//    public Object[] getQueueArry() {
//        return queueArry;
//    }
//
//    public void setQueueArry(Object[] queueArry) {
//        this.queueArry = queueArry;
//    }
//
//    public int getFront() {
//        return front;
//    }
//
//    public void setFront(int front) {
//        this.front = front;
//    }
//
//    public int getRear() {
//        return rear;
//    }
//
//    public void setRear(int rear) {
//        this.rear = rear;
//    }
}
