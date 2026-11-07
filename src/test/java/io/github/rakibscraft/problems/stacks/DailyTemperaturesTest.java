package io.github.rakibscraft.problems.stacks;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class DailyTemperaturesTest {

    private final DailyTemperatures solver = new DailyTemperatures();

    @Test
    void mixedTemperatures() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                solver.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void alwaysRising() {
        assertArrayEquals(new int[]{1, 1, 1, 0}, solver.dailyTemperatures(new int[]{30, 40, 50, 60}));
    }

    @Test
    void alwaysFalling() {
        assertArrayEquals(new int[]{0, 0, 0}, solver.dailyTemperatures(new int[]{60, 50, 40}));
    }
}
