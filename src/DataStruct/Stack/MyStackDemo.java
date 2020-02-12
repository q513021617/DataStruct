package DataStruct.Stack;

public class MyStackDemo {

    public static void main(String[] args) {

        MyStack<Integer> myStack=new MyStack<>(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.display();
        myStack.pop();
        myStack.display();
        myStack.pop();
        myStack.display();
        myStack.pop();
        myStack.display();
        myStack.pop();
        myStack.display();
        myStack.pop();
        myStack.display();
        myStack.pop();
        myStack.display();

    }
}
