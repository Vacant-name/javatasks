package leetCode.N83_RemoveFromSortedList;


public class RemoveFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode listNew;
        listNew = head;
        if (head == null) {
            return null;
        }
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                System.out.println("while" + head);
            } else {
                head = head.next;
            }
            if (head.next == null) {
                break;
            }

        }

        System.out.println("end" + listNew);
        return listNew;
    }
}