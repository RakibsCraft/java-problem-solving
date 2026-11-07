package io.github.rakibscraft.problems.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class BestTimeToBuyStockTest {

    private final BestTimeToBuyStock solver = new BestTimeToBuyStock();

    @Test
    void profitPossible() {
        assertEquals(5, solver.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void pricesOnlyFall() {
        assertEquals(0, solver.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void singleDay() {
        assertEquals(0, solver.maxProfit(new int[]{5}));
    }

    @Test
    void lowestPriceComesLate() {
        assertEquals(4, solver.maxProfit(new int[]{3, 5, 1, 2, 5}));
    }
}
