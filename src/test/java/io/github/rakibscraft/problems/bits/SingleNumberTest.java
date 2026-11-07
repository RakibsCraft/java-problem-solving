package io.github.rakibscraft.problems.bits;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class SingleNumberTest {

    private final SingleNumber solver = new SingleNumber();

    @Test
    void threeValues() {
        assertEquals(1, solver.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void fiveValues() {
        assertEquals(4, solver.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void negativeValue() {
        assertEquals(-7, solver.singleNumber(new int[]{3, -7, 3}));
    }
}
