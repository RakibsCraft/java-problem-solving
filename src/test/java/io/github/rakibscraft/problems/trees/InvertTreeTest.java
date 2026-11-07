package io.github.rakibscraft.problems.trees;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.TreeNode;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class InvertTreeTest {

    private final InvertTree solver = new InvertTree();

    @Test
    void fullTree() {
        TreeNode result = solver.invertTree(TreeNode.fromLevelOrder(4, 2, 7, 1, 3, 6, 9));
        assertEquals(Arrays.asList(4, 7, 2, 9, 6, 3, 1), TreeNode.toLevelOrder(result));
    }

    @Test
    void smallTree() {
        assertEquals(Arrays.asList(2, 3, 1), TreeNode.toLevelOrder(solver.invertTree(TreeNode.fromLevelOrder(2, 1, 3))));
    }

    @Test
    void emptyTree() {
        assertNull(solver.invertTree(null));
    }
}
