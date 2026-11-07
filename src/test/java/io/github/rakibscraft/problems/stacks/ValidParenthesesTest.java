package io.github.rakibscraft.problems.stacks;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class ValidParenthesesTest {

    private final ValidParentheses solver = new ValidParentheses();

    @Test
    void simplePairs() {
        assertTrue(solver.isValid("()[]{}"));
    }

    @Test
    void wrongType() {
        assertFalse(solver.isValid("(]"));
    }

    @Test
    void wrongOrder() {
        assertFalse(solver.isValid("([)]"));
    }

    @Test
    void nested() {
        assertTrue(solver.isValid("{[]}"));
    }

    @Test
    void unclosed() {
        assertFalse(solver.isValid("(("));
    }

    @Test
    void closingWithNothingOpen() {
        assertFalse(solver.isValid("])"));
    }

    @Test
    void emptyString() {
        assertTrue(solver.isValid(""));
    }
}
