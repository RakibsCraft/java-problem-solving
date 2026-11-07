package io.github.rakibscraft.problems.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ValidPalindromeTest {

    private final ValidPalindrome solver = new ValidPalindrome();

    @Test
    void sentencePalindrome() {
        assertTrue(solver.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void notAPalindrome() {
        assertFalse(solver.isPalindrome("race a car"));
    }

    @Test
    void onlySpaces() {
        assertTrue(solver.isPalindrome(" "));
    }

    @Test
    void digitsCount() {
        assertFalse(solver.isPalindrome("0P"));
    }
}
