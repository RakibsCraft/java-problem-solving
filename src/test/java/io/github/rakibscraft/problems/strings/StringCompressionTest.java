package io.github.rakibscraft.problems.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class StringCompressionTest {

    private final StringCompression solver = new StringCompression();

    @Test
    void compressesRuns() {
        assertEquals("a2b1c5a3", solver.compress("aabcccccaaa"));
    }

    @Test
    void returnsOriginalWhenNotShorter() {
        assertEquals("abc", solver.compress("abc"));
    }

    @Test
    void emptyString() {
        assertEquals("", solver.compress(""));
    }

    @Test
    void longRun() {
        assertEquals("z12", solver.compress("zzzzzzzzzzzz"));
    }
}
