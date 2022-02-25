package leetCode.N141_LinkedListCycle;

public class LinkedListCycleMain {
    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode ln = new ListNode(1);
//        ln.next = new ListNode(2);
//        ln.next.next = new ListNode(3);
//        ln.next.next.next = new ListNode(4);
//        ln.next.next.next.next = new ListNode(2);
//        ln.next.next.next.next.next = ln.next;

        System.out.println(linkedListCycle.hasCycle(ln));
    }
}
