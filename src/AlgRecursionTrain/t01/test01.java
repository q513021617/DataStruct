package AlgRecursionTrain.t01;

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode tail=null;
        while (head!=null){
            ListNode tempListNode=new ListNode(head.val);
            tempListNode.next=tail;
            tail=tempListNode;
            head=head.next;
        }
        return tail;
    }
}
public class test01{

    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode head=new ListNode(0);
        ListNode tail=head;
        for (int i = 1; i <= 3; i++) {
            tail.val=i;
            if (i!=3)
                tail.next = new ListNode(0);
                tail=tail.next;
        }
        head.display(head);
        ListNode node = solution.reverseList(head);
        System.out.println("排序后");
        head.display(node);
    }

}