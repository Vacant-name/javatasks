package leetCode.N148_SortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortList {
    List<Integer> list = new ArrayList<>();
    public ListNode sortList(ListNode head) {
        ListNode listNode = head;
        ListNode listNodeFinal = head;

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            listNode.val = list.get(i);
            listNode = listNode.next;
        }
        System.out.println(listNodeFinal);
        return listNodeFinal;
    }
}
