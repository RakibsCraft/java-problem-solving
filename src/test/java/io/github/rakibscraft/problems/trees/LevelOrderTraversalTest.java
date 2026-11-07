package io.github.rakibscraft.problems.trees;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.TreeNode;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class LevelOrderTraversalTest {

    private final LevelOrderTraversal solver = new LevelOrderTraversal();

    @Test
    void threeLevels() {
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)),
                solver.levelOrder(TreeNode.fromLevelOrder(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void singleNode() {
        assertEquals(List.of(List.of(1)), solver.levelOrder(TreeNode.fromLevelOrder(1)));
    }

    @Test
    void emptyTree() {
        assertEquals(List.of(), solver.levelOrder(null));
    }
}
