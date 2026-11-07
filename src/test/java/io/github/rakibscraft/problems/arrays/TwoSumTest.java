package io.github.rakibscraft.problems.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class TwoSumTest {

    private final TwoSum solver = new TwoSum();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{0, 1}, solver.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void answerNotAtStart() {
        assertArrayEquals(new int[]{1, 2}, solver.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void duplicateValues() {
        assertArrayEquals(new int[]{0, 1}, solver.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void negativeNumbers() {
        assertArrayEquals(new int[]{2, 4}, solver.twoSum(new int[]{1, -2, -3, 4, -5}, -8));
    }
}
