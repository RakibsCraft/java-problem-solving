package io.github.rakibscraft.problems.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class GroupAnagramsTest {

    private final GroupAnagrams solver = new GroupAnagrams();

    /** Sorts each group and then the groups, so the order of your answer doesn't matter. */
    private static List<List<String>> normalise(List<List<String>> groups) {
        List<List<String>> out = new ArrayList<>();
        for (List<String> g : groups) {
            List<String> copy = new ArrayList<>(g);
            Collections.sort(copy);
            out.add(copy);
        }
        out.sort(Comparator.comparing(Object::toString));
        return out;
    }

    @Test
    void mixedWords() {
        List<List<String>> expected = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        assertEquals(normalise(expected),
                normalise(solver.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
    }

    @Test
    void singleEmptyString() {
        assertEquals(normalise(List.of(List.of(""))), normalise(solver.groupAnagrams(new String[]{""})));
    }

    @Test
    void noAnagrams() {
        List<List<String>> expected = List.of(List.of("abc"), List.of("xyz"));
        assertEquals(normalise(expected), normalise(solver.groupAnagrams(new String[]{"abc", "xyz"})));
    }
}
