package leetCode.N83_RemoveFromSortedList;

public class ListNode {

    int val;

    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "N21.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
