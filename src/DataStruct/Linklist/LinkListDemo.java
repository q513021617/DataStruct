package DataStruct.Linklist;

public class LinkListDemo {

    public static void main(String[] args) {


//            LinkList templinklist=new LinkList();
//            增
//            templinklist.add(1);
//            templinklist.add(2);
//        templinklist.add(2);
//        templinklist.add(2);
//            templinklist.add(3);
//        System.out.println("增加了元素");
//            删
//        templinklist.delete(1);
//        System.out.println("删除了元素 1");
//        改
//        templinklist.deleteFirst();
//        删除第一个元素
//        System.out.println("删除第一个元素");
//
//        Node findEle=templinklist.find(1);
//        if(findEle!=null)
//            System.out.println("查找到当前元素: "+ findEle );
//        if(findEle==null)
//            System.out.println("没有查找到当前元素");
//        templinklist.display();

//      双向循环链表
        DoubleList<Integer> doubleList=new DoubleList<Integer>();

//        增
        doubleList.listInsert(1,1);
        doubleList.listInsert(2,2);
        doubleList.listInsert(3,3);
        doubleList.listInsert(4,4);
        doubleList.listInsert(5,5);
//        删
        doubleList.listDelete(2);
//        doubleList.destroyList();//销毁链表,释放空间

//        查
//        doubleList.clearList();
//        doubleList.listTraverse();
//        doubleList.finalize();

      int index = doubleList.locateElem(3);
        System.out.println(index);
       int nextEle=(Integer) doubleList.nextElem(3);
        System.out.println(nextEle);
        int preEle=(Integer) doubleList.preiorElem(3);
        System.out.println(preEle);

    }

}
