package leetCode.N83_RemoveFromSortedList;

public class RemoveFromSortedListMain {
    public static void main(String[] args) {
        RemoveFromSortedList removeFromSortedList = new RemoveFromSortedList();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(2)));
        removeFromSortedList.deleteDuplicates(list);
    }
}
