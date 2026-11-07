package io.github.rakibscraft.problems.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class LongestSubstringWithoutRepeatingTest {

    private final LongestSubstringWithoutRepeating solver = new LongestSubstringWithoutRepeating();

    @Test
    void repeatingPattern() {
        assertEquals(3, solver.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allSameCharacter() {
        assertEquals(1, solver.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void answerInMiddle() {
        assertEquals(3, solver.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void emptyString() {
        assertEquals(0, solver.lengthOfLongestSubstring(""));
    }

    @Test
    void repeatOutsideWindow() {
        assertEquals(3, solver.lengthOfLongestSubstring("abba" + "c"));
    }
}
