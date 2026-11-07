package io.github.rakibscraft.problems.dp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence solver = new LongestCommonSubsequence();

    @Test
    void basicCase() {
        assertEquals(3, solver.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void identical() {
        assertEquals(3, solver.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void nothingInCommon() {
        assertEquals(0, solver.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void orderMatters() {
        assertEquals(1, solver.longestCommonSubsequence("ab", "ba"));
    }
}
