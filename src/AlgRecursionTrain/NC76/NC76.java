package AlgRecursionTrain.NC76;

import java.util.Stack;

/**
 *
 * 用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
 *
 * 示例:
 * 输入:
 * ["PSH1","PSH2","POP","POP"]
 * 返回:
 * 1,2
 * 解析:
 * "PSH1":代表将1插入队列尾部
 * "PSH2":代表将2插入队列尾部
 * "POP“:代表删除一个元素，先进先出=>返回1
 * "POP“:代表删除一个元素，先进先出=>返回2
 * 示例1
 * 输入：
 * ["PSH1","PSH2","POP","POP"]
 * 复制
 * 返回值：
 * 1,2
 *
 *
 */
class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        System.out.print(node+"->");
        stack1.push(node);
    }
    public int pop() {
        if(stack2.size()<=0){
            while (stack1.size()>0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}

public class NC76 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        for (int i = 1; i < 5; i++) {
            solution.push(i);
        }
        System.out.println();
        for (int i = 1; i < 5; i++) {

            System.out.print(solution.pop()+"->");
        }

    }
}
