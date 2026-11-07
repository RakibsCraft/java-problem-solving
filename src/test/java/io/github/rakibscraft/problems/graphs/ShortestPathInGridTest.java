package io.github.rakibscraft.problems.graphs;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ShortestPathInGridTest {

    private final ShortestPathInGrid solver = new ShortestPathInGrid();

    @Test
    void pathAroundWall() {
        assertEquals(4, solver.shortestPath(new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}}));
    }

    @Test
    void blocked() {
        assertEquals(-1, solver.shortestPath(new int[][]{{0, 1}, {1, 0}}));
    }

    @Test
    void singleOpenCell() {
        assertEquals(0, solver.shortestPath(new int[][]{{0}}));
    }

    @Test
    void startIsWall() {
        assertEquals(-1, solver.shortestPath(new int[][]{{1, 0}, {0, 0}}));
    }

    @Test
    void windingPath() {
        int[][] g = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0}
        };
        assertEquals(10, solver.shortestPath(g));
    }
}
