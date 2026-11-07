package io.github.rakibscraft.problems.dp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class CoinChangeTest {

    private final CoinChange solver = new CoinChange();

    @Test
    void basicCase() {
        assertEquals(3, solver.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void impossible() {
        assertEquals(-1, solver.coinChange(new int[]{2}, 3));
    }

    @Test
    void zeroAmount() {
        assertEquals(0, solver.coinChange(new int[]{1}, 0));
    }

    @Test
    void greedyFails() {
        // Greedy picks 4 + 1 + 1 (3 coins). The best answer is 3 + 3 (2 coins).
        assertEquals(2, solver.coinChange(new int[]{1, 3, 4}, 6));
    }
}
