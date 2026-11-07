package io.github.rakibscraft.problems.hashing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence solver = new LongestConsecutiveSequence();

    @Test
    void basicCase() {
        assertEquals(4, solver.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void withDuplicates() {
        assertEquals(9, solver.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, solver.longestConsecutive(new int[]{}));
    }
}
