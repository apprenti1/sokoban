package com.gitlab.sokoban.domain;

import com.gitlab.sokoban.domain.model.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestMapBuilder {

    @Test
    public void testBuild() {
        String mapString = "#\n#";
        Map map = MapBuilder.build(mapString);
        assertEquals(new Size(1, 2), map.size());
        assertEquals(State.WALL, map.tiles().get(0).get(0).type());
        assertEquals(State.WALL, map.tiles().get(1).get(0).type());
    }

    @Test
    public void testToTiles() {
        String mapString = "#\n#";
        List<List<Tile>> tiles = MapBuilder.toTiles(mapString);
        assertEquals(2, tiles.size());
        assertEquals(1, tiles.get(0).size());
        assertEquals(1, tiles.get(1).size());
        assertEquals(new Position(0, 0), tiles.get(0).get(0).position());
        assertEquals(new Position(0, 1), tiles.get(1).get(0).position());
        assertEquals(State.WALL, tiles.get(0).get(0).type());
        assertEquals(State.WALL, tiles.get(1).get(0).type());
    }

    @Test
    public void testToTilesWithEmpty() {
        String mapString = "#\n ";
        List<List<Tile>> tiles = MapBuilder.toTiles(mapString);
        assertEquals(2, tiles.size());
        assertEquals(1, tiles.get(0).size());
        assertEquals(1, tiles.get(1).size());
        assertEquals(new Position(0, 0), tiles.get(0).get(0).position());
        assertEquals(new Position(0, 1), tiles.get(1).get(0).position());
        assertEquals(State.WALL, tiles.get(0).get(0).type());
        assertEquals(State.EMPTY, tiles.get(1).get(0).type());
    }

    @Test
    public void testToTilesWithPlayer() {
        String mapString = "#\n@";
        List<List<Tile>> tiles = MapBuilder.toTiles(mapString);
        assertEquals(2, tiles.size());
        assertEquals(1, tiles.get(0).size());
        assertEquals(1, tiles.get(1).size());
        assertEquals(new Position(0, 0), tiles.get(0).get(0).position());
        assertEquals(new Position(0, 1), tiles.get(1).get(0).position());
        assertEquals(State.WALL, tiles.get(0).get(0).type());
        assertEquals(State.PLAYER, tiles.get(1).get(0).type());
    }

    @Test
    public void testToTilesWithBox() {
        String mapString = "#\n$";
        List<List<Tile>> tiles = MapBuilder.toTiles(mapString);
        assertEquals(2, tiles.size());
        assertEquals(1, tiles.get(0).size());
        assertEquals(1, tiles.get(1).size());
        assertEquals(new Position(0, 0), tiles.get(0).get(0).position());
        assertEquals(new Position(0, 1), tiles.get(1).get(0).position());
        assertEquals(State.WALL, tiles.get(0).get(0).type());
        assertEquals(State.BOX, tiles.get(1).get(0).type());
    }

    @Test
    public void testToTilesWithStorage() {
        String mapString = "#\n.";
        List<List<Tile>> tiles = MapBuilder.toTiles(mapString);
        assertEquals(2, tiles.size());
        assertEquals(1, tiles.get(0).size());
        assertEquals(1, tiles.get(1).size());
        assertEquals(new Position(0, 0), tiles.get(0).get(0).position());
        assertEquals(new Position(0, 1), tiles.get(1).get(0).position());
        assertEquals(State.WALL, tiles.get(0).get(0).type());
        assertEquals(State.STORAGE_CASE, tiles.get(1).get(0).type());
    }
}
