package io.github.rakibscraft.problems.trees;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.github.rakibscraft.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ValidateBSTTest {

    private final ValidateBST solver = new ValidateBST();

    @Test
    void validSmallTree() {
        assertTrue(solver.isValidBST(TreeNode.fromLevelOrder(2, 1, 3)));
    }

    @Test
    void invalidChild() {
        assertFalse(solver.isValidBST(TreeNode.fromLevelOrder(5, 1, 4, null, null, 3, 6)));
    }

    @Test
    void invalidGrandchild() {
        // Every parent-child pair looks fine, but 3 is in 5's right subtree.
        assertFalse(solver.isValidBST(TreeNode.fromLevelOrder(5, 4, 6, null, null, 3, 7)));
    }

    @Test
    void duplicatesNotAllowed() {
        assertFalse(solver.isValidBST(TreeNode.fromLevelOrder(2, 2, 2)));
    }

    @Test
    void extremeValues() {
        assertTrue(solver.isValidBST(TreeNode.fromLevelOrder(Integer.MAX_VALUE)));
        assertTrue(solver.isValidBST(TreeNode.fromLevelOrder(Integer.MIN_VALUE, null, Integer.MAX_VALUE)));
    }
}
