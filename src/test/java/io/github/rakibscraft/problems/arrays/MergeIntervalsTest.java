package io.github.rakibscraft.problems.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class MergeIntervalsTest {

    private final MergeIntervals solver = new MergeIntervals();

    @Test
    void someOverlap() {
        int[][] in = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, solver.merge(in));
    }

    @Test
    void touchingIntervals() {
        assertArrayEquals(new int[][]{{1, 5}}, solver.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    void unsortedInput() {
        assertArrayEquals(new int[][]{{0, 4}}, solver.merge(new int[][]{{1, 4}, {0, 4}}));
    }

    @Test
    void oneIntervalContainsAnother() {
        assertArrayEquals(new int[][]{{1, 10}}, solver.merge(new int[][]{{1, 10}, {2, 3}, {4, 5}}));
    }
}
