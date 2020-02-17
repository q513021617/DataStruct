package DataStruct.Linklist;

public class DoubleListNode<T> {
    T data;
    DoubleListNode next;
    DoubleListNode pre;
    private boolean isDestroy;

    public DoubleListNode() {

    }

    public boolean isDestroy() {
        return isDestroy;
    }

    public void setDestroy(boolean destroy) {
        isDestroy = destroy;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void finalize(){
        if (isDestroy ) {
            System.out.println("销毁双链表节点对象 "+this);
        }

    }

}
