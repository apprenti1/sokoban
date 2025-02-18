package com.gitlab.sokoban.domain.model;

import java.util.ArrayList;
import java.util.List;

public class MapBuilder {

    public static List<List<Tile>> toTiles(String mapString) {
        List<List<Tile>> tiles = new ArrayList<>();
        String[] lines = mapString.split("\n");
        for (int y = 0; y < lines.length; y++) {
            String line = lines[y];
            List<Tile> row = new ArrayList<>();
            for (int x = 0; x < line.length(); x++) {
                char c = line.charAt(x);
                Position position = new Position(x, y);
                State state;
                switch (c) {
                    case '#':
                        state = State.WALL;
                        break;
                    case '$':
                        state = State.BOX;
                        break;
                    case '.':
                        state = State.STORAGE_CASE;
                        break;
                    case '@':
                        state = State.PLAYER;
                        break;
                    case ' ':
                        state = State.EMPTY;
                        break;
                    default:
                        continue;
                }
                row.add(new Tile(position, state));
            }
            tiles.add(row);
        }
        return tiles;
    }

    /*
     * 
     * `#` : Mur
     * `$` : caisse
     * `.` : Case de stockage
     * `@` : Joueur
     * ` ` : Sol
     * 
     * 
     * public enum State {
     *     WALL,
     *     EMPTY,
     *     PLAYER,
     *     BOX,
     *     STORAGE_CASE,
     *     STORED_BOX,
     * }
     * 
     * 
     */

    public static Map build(String mapString) {
        List<List<Tile>> tiles = toTiles(mapString);
        String[] lines = mapString.split("\n");
        int width = lines[0].length();
        int height = lines.length;
        return new Map(new Size(width, height), tiles);
    }
}

