package io.github.rakibscraft.problems.linkedlists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ReverseLinkedListTest {

    private final ReverseLinkedList solver = new ReverseLinkedList();

    @Test
    void fiveNodes() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(solver.reverseList(ListNode.of(1, 2, 3, 4, 5))));
    }

    @Test
    void twoNodes() {
        assertArrayEquals(new int[]{2, 1}, ListNode.toArray(solver.reverseList(ListNode.of(1, 2))));
    }

    @Test
    void emptyList() {
        assertNull(solver.reverseList(null));
    }
}
