

package com.gitlab.sokoban.domain;

import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTile {


    @Test
    public void testEquals() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 2);
        State s1 = State.EMPTY;
        State s2 = State.EMPTY;
        Tile t1 = new Tile(p1, s1);
        Tile t2 = new Tile(p2, s2);

        assertEquals(t1, t2);
    }

    @Test
    public void testNotEquals() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(3, 4);
        State s1 = State.EMPTY;
        State s2 = State.EMPTY;
        Tile t1 = new Tile(p1, s1);
        Tile t2 = new Tile(p2, s2);

        assertNotEquals(t1, t2);
    }

    @Test
    public void testNotEqualsState() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 2);
        State s1 = State.EMPTY;
        State s2 = State.WALL;
        Tile t1 = new Tile(p1, s1);
        Tile t2 = new Tile(p2, s2);

        assertNotEquals(t1, t2);
    }
}