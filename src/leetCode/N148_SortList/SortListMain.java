package leetCode.N148_SortList;

public class SortListMain {
    public static void main(String[] args) {
        SortList sortList = new SortList();
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        sortList.sortList(head);
    }
}
