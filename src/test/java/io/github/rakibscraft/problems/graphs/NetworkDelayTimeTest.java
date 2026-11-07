package io.github.rakibscraft.problems.graphs;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class NetworkDelayTimeTest {

    private final NetworkDelayTime solver = new NetworkDelayTime();

    @Test
    void reachesAll() {
        assertEquals(2, solver.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
    }

    @Test
    void singleEdge() {
        assertEquals(1, solver.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1));
    }

    @Test
    void unreachableNode() {
        assertEquals(-1, solver.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2));
    }

    @Test
    void longerPathIsFaster() {
        // Direct edge 1->3 costs 10, but 1->2->3 costs 2.
        assertEquals(2, solver.networkDelayTime(new int[][]{{1, 3, 10}, {1, 2, 1}, {2, 3, 1}}, 3, 1));
    }
}
