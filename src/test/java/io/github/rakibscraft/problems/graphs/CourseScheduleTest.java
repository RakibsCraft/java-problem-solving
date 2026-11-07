package io.github.rakibscraft.problems.graphs;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class CourseScheduleTest {

    private final CourseSchedule solver = new CourseSchedule();

    @Test
    void simpleChain() {
        assertTrue(solver.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    void directCycle() {
        assertFalse(solver.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void longerCycle() {
        assertFalse(solver.canFinish(3, new int[][]{{1, 0}, {2, 1}, {0, 2}}));
    }

    @Test
    void noPrerequisites() {
        assertTrue(solver.canFinish(3, new int[][]{}));
    }

    @Test
    void diamondShape() {
        assertTrue(solver.canFinish(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }
}
