package io.github.rakibscraft.problems.hashing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class TopKFrequentTest {

    private final TopKFrequent solver = new TopKFrequent();

    private static int[] sorted(int[] a) {
        int[] c = a.clone();
        Arrays.sort(c);
        return c;
    }

    @Test
    void twoMostFrequent() {
        assertArrayEquals(new int[]{1, 2}, sorted(solver.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{1}, sorted(solver.topKFrequent(new int[]{1}, 1)));
    }

    @Test
    void negativeValues() {
        assertArrayEquals(new int[]{-1, 4}, sorted(solver.topKFrequent(new int[]{4, -1, 4, -1, 4, -1, 2}, 2)));
    }
}
