package io.github.rakibscraft.problems.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class MaximumSubarrayTest {

    private final MaximumSubarray solver = new MaximumSubarray();

    @Test
    void mixedValues() {
        assertEquals(6, solver.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solver.maxSubArray(new int[]{1}));
    }

    @Test
    void allNegative() {
        assertEquals(-1, solver.maxSubArray(new int[]{-3, -1, -2}));
    }

    @Test
    void wholeArrayIsBest() {
        assertEquals(23, solver.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
