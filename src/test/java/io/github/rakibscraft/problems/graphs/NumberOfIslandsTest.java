package io.github.rakibscraft.problems.graphs;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class NumberOfIslandsTest {

    private final NumberOfIslands solver = new NumberOfIslands();

    private static char[][] grid(String... rows) {
        char[][] g = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) g[i] = rows[i].toCharArray();
        return g;
    }

    @Test
    void oneLargeIsland() {
        assertEquals(1, solver.numIslands(grid("11110", "11010", "11000", "00000")));
    }

    @Test
    void threeIslands() {
        assertEquals(3, solver.numIslands(grid("11000", "11000", "00100", "00011")));
    }

    @Test
    void diagonalDoesNotConnect() {
        assertEquals(2, solver.numIslands(grid("10", "01")));
    }

    @Test
    void allWater() {
        assertEquals(0, solver.numIslands(grid("000", "000")));
    }
}
