package io.github.rakibscraft.common;

import java.util.ArrayList;
import java.util.List;

/** A singly linked list node, plus helpers used by the tests. */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Builds a list from values, e.g. of(1, 2, 3) gives 1 -> 2 -> 3. Returns null for no values. */
    public static ListNode of(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : values) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    /**
     * Builds a list whose last node points back to the node at index {@code pos},
     * creating a cycle. Use pos = -1 for no cycle.
     */
    public static ListNode withCycle(int[] values, int pos) {
        ListNode head = of(values);
        if (head == null || pos < 0) return head;
        ListNode target = null;
        ListNode tail = head;
        for (int i = 0; ; i++) {
            if (i == pos) target = tail;
            if (tail.next == null) break;
            tail = tail.next;
        }
        tail.next = target;
        return head;
    }

    /** Converts a list (without a cycle) to an array, e.g. for assertions. */
    public static int[] toArray(ListNode head) {
        List<Integer> out = new ArrayList<>();
        for (ListNode n = head; n != null; n = n.next) out.add(n.val);
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}
