package leetCode.N1290_ConvertBinaryInLinkedList;

public class ConvertBinaryInLinkedMain {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        ConvertBinaryInLinked c = new ConvertBinaryInLinked();
        c.getDecimalValue(head);
    }
}
