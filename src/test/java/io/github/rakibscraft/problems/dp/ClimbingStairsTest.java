package io.github.rakibscraft.problems.dp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ClimbingStairsTest {

    private final ClimbingStairs solver = new ClimbingStairs();

    @Test
    void smallInputs() {
        assertEquals(1, solver.climbStairs(1));
        assertEquals(2, solver.climbStairs(2));
        assertEquals(3, solver.climbStairs(3));
        assertEquals(8, solver.climbStairs(5));
    }

    @Test
    @Timeout(1)
    void largeInputMustBeFast() {
        // Plain recursion without memoisation is far too slow for this.
        assertEquals(1836311903, solver.climbStairs(45));
    }
}
