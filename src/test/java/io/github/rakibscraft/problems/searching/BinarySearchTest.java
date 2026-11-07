package io.github.rakibscraft.problems.searching;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class BinarySearchTest {

    private final BinarySearch solver = new BinarySearch();

    @Test
    void found() {
        assertEquals(4, solver.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void notFound() {
        assertEquals(-1, solver.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void firstAndLast() {
        assertEquals(0, solver.search(new int[]{1, 2, 3}, 1));
        assertEquals(2, solver.search(new int[]{1, 2, 3}, 3));
    }

    @Test
    void emptyArray() {
        assertEquals(-1, solver.search(new int[]{}, 5));
    }
}
