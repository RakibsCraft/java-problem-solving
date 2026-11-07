package io.github.rakibscraft.problems.linkedlists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists solver = new MergeTwoSortedLists();

    @Test
    void interleaved() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4},
                ListNode.toArray(solver.mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4))));
    }

    @Test
    void bothEmpty() {
        assertNull(solver.mergeTwoLists(null, null));
    }

    @Test
    void oneEmpty() {
        assertArrayEquals(new int[]{0}, ListNode.toArray(solver.mergeTwoLists(null, ListNode.of(0))));
    }
}
