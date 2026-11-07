package io.github.rakibscraft.problems.searching;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class SearchRotatedSortedArrayTest {

    private final SearchRotatedSortedArray solver = new SearchRotatedSortedArray();

    @Test
    void targetAfterPivot() {
        assertEquals(4, solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void targetBeforePivot() {
        assertEquals(1, solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
    }

    @Test
    void notFound() {
        assertEquals(-1, solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void singleElement() {
        assertEquals(-1, solver.search(new int[]{1}, 0));
    }

    @Test
    void notRotated() {
        assertEquals(2, solver.search(new int[]{1, 3, 5, 7}, 5));
    }
}
