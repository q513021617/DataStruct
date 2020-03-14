package DataStruct.Queue;

public class CircularQueue<T> {

    T t;

    Object[] queueArry;
    int front;
    int rear;
    int size;
    int maxsize;

    public CircularQueue(int maxsize) {

        this.maxsize=maxsize;
        this.queueArry=new Object[maxsize];
        this.size=0;
        this.front=0;
        this.rear=0;
    }

    public void destroyQueue(){

        this.maxsize=0;
        this.queueArry=null;
        this.size=0;
        this.front=0;
        this.rear=0;

    }

    public void clearQueue(){
        this.rear=0;
        this.front=this.rear;
    }

    public boolean In_Queue(T x){

        if (!this.isOverfllow()) {

            this.queueArry[this.rear]=x;
            this.rear=(this.rear + 1)% this.maxsize;
            this.size++;
            return true;
        }
        return false;
    }

    public Object Out_Queue(){

        if (this.isEmpty()) {

            return null;
        }
        Object temp=this.queueArry[this.front];
        this.front=(this.front + 1)%this.maxsize;
        this.size--;
        return temp;
    }

    public boolean isEmpty(){
        if (this.front == this.rear) {
            System.out.println("此队列为空!没有任何元素");
            return true;
        }
        return false;
    }

    public boolean isOverfllow(){

        if (this.front==(this.rear+1)%this.maxsize) {
            System.out.println("此队列已满!不能再插入任何元素");
            return true;
        }
        return false;
    }
    public void display(){
        int p=this.front;
        if (!this.isEmpty()) {

            while (this.rear!=p) {
                System.out.print(this.queueArry[p]+" ");
                p= (p+1) % this.maxsize;
            }
            
            System.out.println();
        }

    }
}
