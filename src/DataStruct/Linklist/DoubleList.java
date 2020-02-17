package DataStruct.Linklist;

public class DoubleList<T> {

    DoubleListNode<T> head;
    boolean isDestroy;
    public DoubleList() {
        this.head = new DoubleListNode<T>();
        this.head.pre=this.head;
        this.head.next=this.head.pre;
    }

//
        public void destroyList(){

            DoubleListNode q,p = this.head.next;
            while (p!=this.head){
                q=p.next;
                p.setDestroy(true);
                p=null;
                p=q;
            }
            this.head=null;
            this.isDestroy=true;
            System.gc();
        }

// 销毁双向循环链表L 声明此方法说明当满足一个特定条件的时候就释放对象
    public void finalize(){

        if (isDestroy ) {
            System.out.println("销毁双链表对象 "+this);
        }
    }
//    重置链表为空表
        public void clearList(){
            DoubleListNode q,p = this.head.next;

            while (p!=this.head){
                    q=p.next;
                    p=null;
                    p=q;
            }

            this.head.pre=this.head;
            this.head.next = this.head.pre;
    }

//  验证是否为空表
    public boolean isListEmpty(){

        if (this.head.next == this.head && this.head.pre==this.head) {
            return true;
        }

        return false;
    }

//  计算表内元素个数
    public int listLength(){
        int i=0;
        DoubleListNode p=this.head.next;
        while (p!=this.head){
            i++;
            p=p.next;
        }
        return i;
    }

//赋值
    /* 当第i个元素存在时，其值赋给e并返回OK，否则返回ERROR */
   public Object getElem(int i){
       int j=1;
       DoubleListNode p=this.head.next;
       while (p!=this.head&&j<i){
           p=p.next;
           j++;
       }

       if (p == this.head || j>i) {
           return null;
       }

       return p;
   }

//查找元素,返回数据所在的位置
    public int locateElem(T t){
        int i=0;
        DoubleListNode p=this.head.next;
        while (p!=this.head){
            i++;
            if (t == p.data) {
                return i;
            }
            p=p.next;
        }

       return 0;
    }

//    查找元素前驱
   public Object preiorElem(T t){
       DoubleListNode p=this.head.next;
        while (p!=t){
            if (p.data == t) {
                return p.pre.data;
            }
            p=p.next;
        }
        return false;
    }
//    查找元素后继
    public Object nextElem(T t){
    DoubleListNode p=this.head.next;
    while (p!=t){
        if (p.data == t) {
            return p.next.data;
        }
        p=p.next;
    }
        return false;
    }

//    查找第i个元素地址
public Object getElemAddr(int i){
       int j=0;
    DoubleListNode p=this.head;

    if(i<0||i>listLength()){
        return null;
    }

    for (j = 1; j <= i; j++) {
            p=p.next;

        }

    return p;
}

// 元素的插入
public boolean listInsert(T t,int i){
    DoubleListNode p,s;

       if(i<1 || i>listLength()+1){
            return false;
       }
       p=(DoubleListNode)getElemAddr(i-1);
       if(p==null){
           return false;
       }
       s=new DoubleListNode();
       if(s==null){
           return false;
       }

       s.data=t;
       s.pre=p;
       s.next=p.next;
       p.next.pre=s;
       p.next=s;
       return true;
}

// 元素的删除
/* 删除带头结点的双链循环线性表L的第i个元素，i的合法值为1≤i≤表长 */
Object listDelete(int i){
    DoubleListNode p;

    if(i<1){
        return false;
    }

    p=(DoubleListNode)getElem(i);
    if(p==null){
        return false;
    }

    Object tempData= p.data;
    p.pre.next = p.next;
    p.next.pre = p.pre;

    return tempData;
}


//正序遍历
/* 由双链循环线性表L的头结点出发，正序对每个数据元素调用函数visit() */
  public void listTraverse(){
        DoubleListNode p=this.head.next;
        while (p!=this.head){
            System.out.print(p.data+" ");
            p=p.next;
        }

        System.out.println();
  }


//  逆序遍历
/* 由双链循环线性表L的头结点出发，逆序对每个数据元素调用函数visit()。另加 */

    public void listTraverseBack(){
        DoubleListNode p=this.head.pre;
        while (p!=this.head){
            System.out.print(p.data+" ");
            p=p.pre;
        }
        System.out.println();
    }

}
