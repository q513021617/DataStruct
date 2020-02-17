package DataStruct.Stack;

public class MyStackDemo {

    public static void main(String[] args) {

//        顺序栈
//        MyStack<Integer> myStack=new MyStack<>(5);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        myStack.display();
//        myStack.pop();
//        myStack.display();
//        myStack.pop();
//        myStack.display();
//        myStack.pop();
//        myStack.display();
//        myStack.pop();
//        myStack.display();
//        myStack.pop();
//        myStack.display();
//        myStack.pop();
//        myStack.display();
//      链表栈
        StackList<Integer> stackList=new StackList<>();
        stackList.push(1);
        stackList.push(1);
        stackList.push(1);
        stackList.push(1);
        stackList.push(1);
        stackList.display();

        System.out.println("出栈: "+stackList.pop());
        stackList.display();
        System.out.println("出栈: "+stackList.pop());
        System.out.println("出栈: "+stackList.pop());
        stackList.display();
        System.out.println("出栈: "+stackList.pop());
        System.out.println("出栈: "+stackList.pop());
        stackList.display();
    }
}
