package io.github.rakibscraft.problems.trees;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class MaxDepthTest {

    private final MaxDepth solver = new MaxDepth();

    @Test
    void balancedTree() {
        assertEquals(3, solver.maxDepth(TreeNode.fromLevelOrder(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void rightLeaningTree() {
        assertEquals(2, solver.maxDepth(TreeNode.fromLevelOrder(1, null, 2)));
    }

    @Test
    void emptyTree() {
        assertEquals(0, solver.maxDepth(null));
    }
}
