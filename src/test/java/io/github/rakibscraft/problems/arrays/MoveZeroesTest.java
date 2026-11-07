package io.github.rakibscraft.problems.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class MoveZeroesTest {

    private final MoveZeroes solver = new MoveZeroes();

    @Test
    void mixedZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        solver.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void singleZero() {
        int[] nums = {0};
        solver.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void noZeroes() {
        int[] nums = {1, 2, 3};
        solver.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void zeroesAlreadyAtEnd() {
        int[] nums = {4, 5, 0, 0};
        solver.moveZeroes(nums);
        assertArrayEquals(new int[]{4, 5, 0, 0}, nums);
    }
}
