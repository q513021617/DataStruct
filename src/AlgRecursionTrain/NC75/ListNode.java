package AlgRecursionTrain.NC75;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    void display(ListNode head){
        while (head!=null){
            System.out.print(head+"->");
            head=head.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return val+"";
    }
}
