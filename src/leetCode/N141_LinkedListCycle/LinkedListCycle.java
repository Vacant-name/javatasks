package leetCode.N141_LinkedListCycle;

import java.util.*;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        Set<Integer> hashSet = new HashSet<>();
        while (head != null) {
            if (head.next == null) {
                break;
            }
            if (hashSet.contains(head.next.hashCode())) {
                System.out.println("Cycle");
                System.out.println('a' - 'b');

                return true;
            } else {
                hashSet.add(head.next.hashCode());
                head = head.next;
            }
        }
        System.out.println("No cycle");

        return false;
    }
}
