package leetCode.N21_MergeTwoSortedLists;

public class MergeTwoSortedListsMain {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3)));

//        System.out.println(list1.next.next.val);


        mergeTwoSortedLists.mergeTwoLists(list1,list2);
    }
}
