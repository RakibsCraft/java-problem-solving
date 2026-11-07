package io.github.rakibscraft.problems.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ProductExceptSelfTest {

    private final ProductExceptSelf solver = new ProductExceptSelf();

    @Test
    void positiveNumbers() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solver.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void containsZero() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solver.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    void twoElements() {
        assertArrayEquals(new int[]{5, 2}, solver.productExceptSelf(new int[]{2, 5}));
    }
}
