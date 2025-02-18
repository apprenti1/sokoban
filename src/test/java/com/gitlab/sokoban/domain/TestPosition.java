package com.gitlab.sokoban.domain;

import com.gitlab.sokoban.domain.model.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPosition {

    @Test
    public void testEquals() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 2);
        assertEquals(p1, p2);
    }

    @Test
    public void testNotEquals() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 3);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testHashCode() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testNotHashCode() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 3);
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }
}

