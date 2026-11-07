package io.github.rakibscraft.problems.stacks;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Not started. Delete this line when you begin the problem.")
class MinStackTest {

    @Test
    void tracksMinimumThroughPops() {
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        assertEquals(-3, s.getMin());
        s.pop();
        assertEquals(0, s.top());
        assertEquals(-2, s.getMin());
    }

    @Test
    void duplicateMinimums() {
        MinStack s = new MinStack();
        s.push(1);
        s.push(1);
        s.pop();
        assertEquals(1, s.getMin());
    }

    @Test
    void minimumPushedFirst() {
        MinStack s = new MinStack();
        s.push(2);
        s.push(5);
        s.push(7);
        assertEquals(2, s.getMin());
        assertEquals(7, s.top());
    }
}
