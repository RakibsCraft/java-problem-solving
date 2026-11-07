package io.github.rakibscraft.problems.dp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class HouseRobberTest {

    private final HouseRobber solver = new HouseRobber();

    @Test
    void fourHouses() {
        assertEquals(4, solver.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void fiveHouses() {
        assertEquals(12, solver.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void skipTwoInARow() {
        assertEquals(4, solver.rob(new int[]{2, 1, 1, 2}));
    }

    @Test
    void singleHouse() {
        assertEquals(5, solver.rob(new int[]{5}));
    }
}
