package AlgRecursionTrain.t02;

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node01=head;
        ListNode node02=head;
        while (head!=null){
            node01=node01.next;
            if(node01==null){
                return false;
            }
            if(node02.next!=null){
                return false;
            }
            node02=node02.next.next;
            if(node02!=null){
                return false;
            }
            if(node01.val==node02.val){
                return true;
            }
        }
        return false;
    }
}
public class test02{

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
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("是否有环:"+hasCycle);
    }

}