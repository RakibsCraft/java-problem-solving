package io.github.rakibscraft.problems.bits;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class CountingBitsTest {

    private final CountingBits solver = new CountingBits();

    @Test
    void upToTwo() {
        assertArrayEquals(new int[]{0, 1, 1}, solver.countBits(2));
    }

    @Test
    void upToFive() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solver.countBits(5));
    }

    @Test
    void zero() {
        assertArrayEquals(new int[]{0}, solver.countBits(0));
    }
}
