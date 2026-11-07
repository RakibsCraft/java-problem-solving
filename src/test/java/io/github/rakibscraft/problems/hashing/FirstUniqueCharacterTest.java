package io.github.rakibscraft.problems.hashing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class FirstUniqueCharacterTest {

    private final FirstUniqueCharacter solver = new FirstUniqueCharacter();

    @Test
    void firstCharacterIsUnique() {
        assertEquals(0, solver.firstUniqChar("leetcode"));
    }

    @Test
    void uniqueInMiddle() {
        assertEquals(2, solver.firstUniqChar("loveleetcode"));
    }

    @Test
    void noUniqueCharacter() {
        assertEquals(-1, solver.firstUniqChar("aabb"));
    }
}
