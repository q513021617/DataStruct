#数据结构之链表
##使用方法
````
package DataStruct.Linklist;

public class LinkListDemo {

    public static void main(String[] args) {
            LinkList templinklist=new LinkList();
//            增
            templinklist.add(1);
            templinklist.add(2);
        templinklist.add(2);
        templinklist.add(2);
            templinklist.add(3);
        System.out.println("增加了元素");
//            删
        templinklist.delete(1);
        System.out.println("删除了元素 1");
//        改
        templinklist.deleteFirst();
//        删除第一个元素
        System.out.println("删除第一个元素");

        Node findEle=templinklist.find(1);
        if(findEle!=null)
            System.out.println("查找到当前元素: "+ findEle );
        if(findEle==null)
            System.out.println("没有查找到当前元素");
        templinklist.display();

    }

}



````