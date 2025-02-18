package com.gitlab.sokoban.domain;

import com.gitlab.sokoban.domain.model.Map;
import com.gitlab.sokoban.domain.model.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestMap {

    @Test
    public void testEquals() {
        Map map1 = new Map(new Size(2, 2), List.of(
                List.of(
                        new Tile(new Position(0, 0), State.WALL),
                        new Tile(new Position(1, 0), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 1), State.EMPTY),
                        new Tile(new Position(1, 1), State.WALL)
                )
        ));

        Map map2 = new Map(new Size(2, 2), List.of(
                List.of(
                        new Tile(new Position(0, 0), State.WALL),
                        new Tile(new Position(1, 0), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 1), State.EMPTY),
                        new Tile(new Position(1, 1), State.WALL)
                )
        ));

        assertEquals(map1, map2);
    }
    @Test
    public void testNotEquals() {
        Map map1 = new Map(new Size(2, 2), List.of(
                List.of(
                        new Tile(new Position(0, 0), State.WALL),
                        new Tile(new Position(1, 0), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 1), State.EMPTY),
                        new Tile(new Position(1, 1), State.WALL)
                )
        ));

        Map map2 = new Map(new Size(3, 3), List.of(
                List.of(
                        new Tile(new Position(0, 0), State.WALL),
                        new Tile(new Position(1, 0), State.EMPTY),
                        new Tile(new Position(2, 0), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 1), State.EMPTY),
                        new Tile(new Position(1, 1), State.WALL),
                        new Tile(new Position(2, 1), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 2), State.EMPTY),
                        new Tile(new Position(1, 2), State.EMPTY),
                        new Tile(new Position(2, 2), State.WALL)
                )
        ));

        assertNotEquals(map1, map2);
    }

    @Test
    public void testNotEqualsNull() {
        Map map1 = new Map(new Size(2, 2), List.of(
                List.of(
                        new Tile(new Position(0, 0), State.WALL),
                        new Tile(new Position(1, 0), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 1), State.EMPTY),
                        new Tile(new Position(1, 1), State.WALL)
                )
        ));

        assertNotEquals(map1, null);
    }

    @Test
    public void testNotEqualsWrongType() {
        Map map1 = new Map(new Size(2, 2), List.of(
                List.of(
                        new Tile(new Position(0, 0), State.WALL),
                        new Tile(new Position(1, 0), State.EMPTY)
                ),
                List.of(
                        new Tile(new Position(0, 1), State.EMPTY),
                        new Tile(new Position(1, 1), State.WALL)
                )
        ));

        assertNotEquals(map1, "test");
    }
}

