package io.github.rakibscraft.problems.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ValidAnagramTest {

    private final ValidAnagram solver = new ValidAnagram();

    @Test
    void isAnagram() {
        assertTrue(solver.isAnagram("anagram", "nagaram"));
    }

    @Test
    void differentLetters() {
        assertFalse(solver.isAnagram("rat", "car"));
    }

    @Test
    void differentLengths() {
        assertFalse(solver.isAnagram("a", "ab"));
    }

    @Test
    void sameLettersDifferentCounts() {
        assertFalse(solver.isAnagram("aab", "abb"));
    }
}
