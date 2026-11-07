package io.github.rakibscraft.problems.bits;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class PowerOfTwoTest {

    private final PowerOfTwo solver = new PowerOfTwo();

    @Test
    void powers() {
        assertTrue(solver.isPowerOfTwo(1));
        assertTrue(solver.isPowerOfTwo(16));
        assertTrue(solver.isPowerOfTwo(1 << 30));
    }

    @Test
    void notPowers() {
        assertFalse(solver.isPowerOfTwo(3));
        assertFalse(solver.isPowerOfTwo(6));
    }

    @Test
    void zeroAndNegatives() {
        assertFalse(solver.isPowerOfTwo(0));
        assertFalse(solver.isPowerOfTwo(-16));
        assertFalse(solver.isPowerOfTwo(Integer.MIN_VALUE));
    }
}
