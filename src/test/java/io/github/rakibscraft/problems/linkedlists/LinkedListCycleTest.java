package io.github.rakibscraft.problems.linkedlists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class LinkedListCycleTest {

    private final LinkedListCycle solver = new LinkedListCycle();

    @Test
    void cycleToSecondNode() {
        assertTrue(solver.hasCycle(ListNode.withCycle(new int[]{3, 2, 0, -4}, 1)));
    }

    @Test
    void cycleToHead() {
        assertTrue(solver.hasCycle(ListNode.withCycle(new int[]{1, 2}, 0)));
    }

    @Test
    void noCycle() {
        assertFalse(solver.hasCycle(ListNode.of(1, 2, 3)));
    }

    @Test
    void emptyList() {
        assertFalse(solver.hasCycle(null));
    }
}
