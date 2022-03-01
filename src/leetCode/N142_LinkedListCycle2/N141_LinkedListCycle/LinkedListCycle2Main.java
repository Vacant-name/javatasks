package leetCode.N142_LinkedListCycle2.N141_LinkedListCycle;

public class LinkedListCycle2Main {
    public static void main(String[] args) {
        LinkedListCycle2 linkedListCycle = new LinkedListCycle2();
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = ln.next;
//        ln.next.next.next.next.next = ln.next;

        System.out.println(linkedListCycle.detectCycle(ln));
    }
}
