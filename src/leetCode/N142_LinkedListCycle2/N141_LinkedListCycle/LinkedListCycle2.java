package leetCode.N142_LinkedListCycle2.N141_LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {
    ListNode end;

    public ListNode detectCycle(ListNode head) {
        end = head;
        Set<Integer> hashSet = new HashSet<>();
        while (head != null) {
            if (head.next == null) {
                break;
            }
            if (hashSet.contains(head.hashCode())) {
                System.out.println("cycle");
                end = head;
                return end;
            } else {
                hashSet.add(head.hashCode());
                head = head.next;
            }
        }
        end = null;
        System.out.println("No cycle");
        return end;
    }
}
